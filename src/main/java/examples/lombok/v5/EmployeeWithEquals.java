package examples.lombok.v5;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@EqualsAndHashCode // By default, it'll use all non-static, non-transient fields
@Getter
@Setter
@NoArgsConstructor
class EmployeeWithEquals {

    private UUID id;
    private String name;
    private LocalDate dateOfBirth;
    private double salary;
    private boolean active;
    private List<String> skills;
}
