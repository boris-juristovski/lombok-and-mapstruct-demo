package examples.lombok.v8;

import java.time.LocalDate;
import java.util.UUID;

public class App8 {

    public static void main(String[] args) {
        Employee employee = Employee.builder()
                .id(UUID.randomUUID())
                .salary(123.45)
                .dateOfBirth(LocalDate.now())
                .name("John Doe")
                .privateFieldFromParent("private field from parent")
                .build();
    }
}
