package examples.lombok.v6;

import java.util.List;
import java.util.UUID;

public class App6 {

    public static void main(String[] args) {
        Employee employee = Employee.builder()
                .id(UUID.randomUUID())
                .skills(List.of())
                .name("John Doe")
                // ...
                .build();
    }
}
