package examples.lombok.v8;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Getter
@Setter
@SuperBuilder
abstract class Person {

    private String name;
    protected LocalDate dateOfBirth;
    private String privateFieldFromParent;
}
