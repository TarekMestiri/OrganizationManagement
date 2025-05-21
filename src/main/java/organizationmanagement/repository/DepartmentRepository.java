package organizationmanagement.repository;

import organizationmanagement.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    List<Department> findByOrganizationId(Long organizationId);
    boolean existsByNameAndOrganizationId(String name, Long organizationId);

}
