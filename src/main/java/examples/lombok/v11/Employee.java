package examples.lombok.v11;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@Getter
@Setter
class Employee {

    private UUID id;
    private String name;
    private LocalDate dateOfBirth;
}
