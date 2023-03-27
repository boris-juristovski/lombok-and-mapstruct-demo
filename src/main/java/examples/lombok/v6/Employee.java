package examples.lombok.v6;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Builder
class Employee {

    private UUID id;
    private String name;
    private LocalDate dateOfBirth;
    private double salary;
    private boolean active;
    private List<String> skills;
}
