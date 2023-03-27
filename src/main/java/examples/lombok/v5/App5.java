package examples.lombok.v5;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Slf4j
public class App5 {

    private static final UUID ID = UUID.randomUUID();
    private static final String NAME = "John";
    private static final LocalDate DATE_OF_BIRTH = LocalDate.of(1980, 7, 20);
    private static final double SALARY = 1234.56;
    private static final boolean IS_ACTIVE = false;
    private static final List<String> SKILLS = List.of("lazy", "smart");

    public static void main(String[] args) {
        Employee e1 = getEmployee();
        Employee e2 = getEmployee();

        log.info("Equals ? {}", Objects.equals(e1, e2));

        // With equals and hash code

        EmployeeWithEquals e3 = getEmployeeWithEquals();
        EmployeeWithEquals e4 = getEmployeeWithEquals();

        log.info("Equals ? {}", Objects.equals(e3, e4));
    }

    private static Employee getEmployee() {
        Employee empl = new Employee();

        empl.setId(ID);
        empl.setName(NAME);
        empl.setActive(IS_ACTIVE);
        empl.setSkills(SKILLS);
        empl.setSalary(SALARY);
        empl.setDateOfBirth(DATE_OF_BIRTH);

        return empl;
    }

    private static EmployeeWithEquals getEmployeeWithEquals() {
        EmployeeWithEquals empl = new EmployeeWithEquals();

        empl.setId(ID);
        empl.setName(NAME);
        empl.setActive(IS_ACTIVE);
        empl.setSkills(SKILLS);
        empl.setSalary(SALARY);
        empl.setDateOfBirth(DATE_OF_BIRTH);

        return empl;
    }
}
