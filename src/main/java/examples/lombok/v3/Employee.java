package examples.lombok.v3;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@RequiredArgsConstructor
class Employee {

    private final UUID id;
    private final String name;
    private LocalDate dateOfBirth;
    private double salary;
    private boolean active;
    private List<String> skills;
}
