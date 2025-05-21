package organizationmanagement.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    @OneToMany(mappedBy = "organization", cascade = CascadeType.PERSIST, orphanRemoval = true)
    @JsonIgnore // Optional: prevents recursive serialization if needed
    private List<Department> departments = new ArrayList<>();
}
