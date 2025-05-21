package organizationmanagement.dto;

public class TeamDTO {
    private Long id;
    private String name;
    private DepartmentDTO department;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public DepartmentDTO getDepartment() { return department; }
    public void setDepartment(DepartmentDTO department) { this.department = department; }
}
