package examples.lombok.v4;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Slf4j
public class App4 {

    private static final UUID ID = UUID.randomUUID();
    private static final String NAME = "John";
    private static final LocalDate DATE_OF_BIRTH = LocalDate.of(1980, 7, 20);
    private static final double SALARY = 1234.56;
    private static final boolean IS_ACTIVE = false;
    private static final List<String> SKILLS = List.of("lazy", "smart");

    public static void main(String[] args) {
        Employee empl = getEmployee();
        EmployeeToString emplToString = getEmployeeToString();

        log.info("Without toString:\n{}", empl);
        log.info("With toString:\n{}", emplToString);
    }

    private static EmployeeToString getEmployeeToString() {
        EmployeeToString empl = new EmployeeToString();

        empl.setId(ID);
        empl.setName(NAME);
        empl.setActive(IS_ACTIVE);
        empl.setSkills(SKILLS);
        empl.setSalary(SALARY);
        empl.setDateOfBirth(DATE_OF_BIRTH);

        return empl;
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


}
