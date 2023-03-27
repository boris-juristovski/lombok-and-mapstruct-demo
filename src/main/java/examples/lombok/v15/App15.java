package examples.lombok.v15;

import java.util.UUID;

public class App15 {

    public static void main(String[] args) {
        Employee empl = Employee.of(UUID.randomUUID(), "John Doe");
    }
}
