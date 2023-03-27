package examples.lombok.v13;

import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;

@Data
class Employee {

    private final UUID id;
    private final String name;
    private final LocalDate dateOfBirth;
}
