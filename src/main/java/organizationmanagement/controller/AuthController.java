package organizationmanagement.controller;

import lombok.RequiredArgsConstructor;
import organizationmanagement.dto.SignupRequestDTO;
import organizationmanagement.model.Organization;
import organizationmanagement.service.OrganizationService;
//import organizationmanagement.service.UserService;
import organizationmanagement.exception.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final OrganizationService organizationService;
    //private final UserService userService;

    @PostMapping("/register/{id}")
    public ResponseEntity<?> registerWithId(@PathVariable UUID id, @RequestBody SignupRequestDTO request) {
        Organization org = organizationService.getById(id);

        System.out.println("ID is valid. Organization name: " + org.getName());
        System.out.println("Received request body: " + request);

        // Temporary mock (remove when Bechir finishes)
        System.out.println("Pretend we're registering the user here...");

        return ResponseEntity.ok("Organization validated. User registration placeholder.");
        // TODO: Implement this in UserService when Bechir is ready
        //userService.registerUserWithOrganization(request, org);
        // return ResponseEntity.ok("User registered and assigned to organization.");
    }
}
