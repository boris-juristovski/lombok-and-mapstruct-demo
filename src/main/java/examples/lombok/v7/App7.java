package examples.lombok.v7;

import java.util.UUID;

public class App7 {

    public static void main(String[] args) {
        Employee employee = Employee.builder()
                .id(UUID.randomUUID())
                .salary(123.45)
                .build();
    }
}
