package examples.lombok.v4;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
class Employee {

    private UUID id;
    private String name;
    private LocalDate dateOfBirth;
    private double salary;
    private boolean active;
    private List<String> skills;
}
