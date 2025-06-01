package organizationmanagement.dto;

import lombok.Data;

@Data
public class SignupRequestDTO {
    private String username;
    private String email;
    private String password;

    // Add other fields if needed, like firstName, lastName, etc.
}
