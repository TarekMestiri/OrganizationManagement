package organizationmanagement.controller;

import organizationmanagement.dto.DepartmentDTO;
import organizationmanagement.dto.TeamCreateDTO;
import organizationmanagement.dto.TeamDTO;
import organizationmanagement.model.Department;
import organizationmanagement.model.Team;
import organizationmanagement.service.DepartmentService;
import organizationmanagement.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/teams")
@RequiredArgsConstructor
public class TeamController {

    private final TeamService service;
    private final DepartmentService departmentService;

    @GetMapping
    public List<TeamDTO> getAll() {
        return service.getAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @PostMapping
    public TeamDTO create(@RequestBody TeamCreateDTO teamDto) {
        Team teamEntity = convertToEntity(teamDto);

        if (teamDto.getDepartmentId() == null) {
            throw new IllegalArgumentException("Department ID must be provided to create a team.");
        }

        Team saved = service.createUnderDepartment(teamDto.getDepartmentId(), teamEntity);
        return convertToDTO(saved);
    }


    @GetMapping("/{id}")
    public TeamDTO getById(@PathVariable Long id) {
        Team team = service.getById(id);
        if (team == null) {
            return null;
        }
        return convertToDTO(team);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    // Mapping methods

    private TeamDTO convertToDTO(Team team) {
        TeamDTO dto = new TeamDTO();
        dto.setId(team.getId());
        dto.setName(team.getName());

        Department dept = team.getDepartment();
        if (dept != null) {
            DepartmentDTO deptDto = new DepartmentDTO();
            deptDto.setId(dept.getId());
            deptDto.setName(dept.getName());
            dto.setDepartment(deptDto);
        }
        return dto;
    }

    private Team convertToEntity(TeamCreateDTO dto) {
        Team team = new Team();
        team.setName(dto.getName());
        if (dto.getDepartmentId() != null) {
            Department dept = departmentService.getById(dto.getDepartmentId());
            team.setDepartment(dept);
        }
        return team;
    }
}
