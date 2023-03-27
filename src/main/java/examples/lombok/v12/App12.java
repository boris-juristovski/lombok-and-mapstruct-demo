package examples.lombok.v12;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.util.UUID;

@Slf4j
public class App12 {

    public static void main(String[] args) {
        Employee immutableEmpl = new Employee(UUID.randomUUID(), "John Doe", LocalDate.now());

        Employee empl = immutableEmpl.withName("Edited");

        log.info("{}", immutableEmpl);
        log.info("{}", empl);
    }
}
