package organizationmanagement.repository;

import organizationmanagement.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeamRepository extends JpaRepository<Team, Long> {
    List<Team> findByDepartmentId(Long departmentId);
    boolean existsByNameAndDepartmentId(String name, Long departmentId);
}




