package organizationmanagement.repository;

import organizationmanagement.model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {

    Optional<Organization> findByInvitationCode(String invitationCode);
    Optional<Organization> getByInvitationCode(String token);

}

