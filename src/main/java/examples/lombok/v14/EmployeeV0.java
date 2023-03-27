package examples.lombok.v14;

import lombok.Builder;
import lombok.Value;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Value
@Builder
class EmployeeV0 {

    UUID id;
    String name;
    LocalDate dateOfBirth;
    double salary;
    boolean active;
    List<String> skills;
}