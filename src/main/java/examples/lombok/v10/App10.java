package examples.lombok.v10;

import java.time.LocalDate;
import java.util.UUID;

public class App10 {

    public static void main(String[] args) {
        Employee empl = new Employee(UUID.randomUUID(), "John", LocalDate.now());

        // instead of empl.getName();
        String name = empl.name();

    }
}
