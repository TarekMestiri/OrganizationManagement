package organizationmanagement.dto;

public class DepartmentDTO {
    private Long id;
    private String name;
    private OrganizationDTO organization;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public OrganizationDTO getOrganization() { return organization; }
    public void setOrganization(OrganizationDTO organization) { this.organization = organization; }
}
