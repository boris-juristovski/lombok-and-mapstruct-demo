package examples.lombok.v7;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
abstract class Person {

    private String name;
    protected LocalDate dateOfBirth;
}
