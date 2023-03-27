package examples.lombok.v2;

import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;

// clean way for logging
@Slf4j
public class App2 {

    public static void main(String[] args) {
      Employee employee = new Employee();
      employee.setSalary(12.34);

      log.info("Salary {}", employee.getSalary());
    }

    private static void printDate(@NonNull LocalDate date) {
        log.info("{}", date);
    }
}
