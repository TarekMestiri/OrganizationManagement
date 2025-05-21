package organizationmanagement.service;

import organizationmanagement.exception.BadRequestException;
import organizationmanagement.exception.ResourceNotFoundException;
import organizationmanagement.model.Department;
import organizationmanagement.model.Team;
import organizationmanagement.repository.DepartmentRepository;
import organizationmanagement.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeamService {

    private final TeamRepository teamRepository;
    private final DepartmentRepository departmentRepository;

    public List<Team> getAll() {
        return teamRepository.findAll();
    }

    public Team getById(Long id) {
        return teamRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Team not found with id: " + id));
    }

    public void delete(Long id) {
        if (!teamRepository.existsById(id)) {
            throw new ResourceNotFoundException("Team not found with id: " + id);
        }
        teamRepository.deleteById(id);
    }

    public List<Team> getByDepartmentId(Long departmentId) {
        return teamRepository.findByDepartmentId(departmentId);
    }

    public Team createUnderDepartment(Long deptId, Team team) {
        validateTeamName(team.getName());

        Department department = departmentRepository.findById(deptId)
                .orElseThrow(() -> new ResourceNotFoundException("Department not found with id: " + deptId));

        // Check for uniqueness of team name within the department
        boolean exists = teamRepository.existsByNameAndDepartmentId(team.getName().trim(), deptId);
        if (exists) {
            throw new BadRequestException("A team with the name '" + team.getName().trim() + "' already exists in this department.");
        }

        team.setDepartment(department);
        return teamRepository.save(team);
    }

    private void validateTeamName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new BadRequestException("Team name must not be empty.");
        }
        String trimmed = name.trim();
        if (trimmed.length() < 2 || trimmed.length() > 100) {
            throw new BadRequestException("Team name must be between 2 and 100 characters.");
        }
    }
}
