package organizationmanagement.controller;

import organizationmanagement.model.Organization;
import organizationmanagement.service.OrganizationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.access.prepost.PreAuthorize;

import java.util.List;

@RestController
@RequestMapping("/api/organizations")
@RequiredArgsConstructor
public class OrganizationController {

    private final OrganizationService service;

    @GetMapping
    public List<Organization> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Organization create(@RequestBody Organization org) {
        return service.create(org);
    }

    @GetMapping("/{id}")
    public Organization getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
