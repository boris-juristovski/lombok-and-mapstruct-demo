package examples.lombok.v14;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class App0 {

    public static void main(String[] args) {
        EmployeeV0 employee = EmployeeV0.builder()
                .id(UUID.randomUUID())
                .name("John Doe")
                .dateOfBirth(LocalDate.of(1980, 1, 1))
                .salary(50000)
                .active(true)
                .skills(List.of("Java", "SQL"))
                .build();

        EmployeeV0 employee1 = EmployeeV0.builder()
                .name("John Doe")
                .build();

        Employee empl = new Employee(null, "John Doe", null, 0, true, List.of(), null, null, null);


    }
}
