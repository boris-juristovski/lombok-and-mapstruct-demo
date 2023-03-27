package examples.lombok.v8;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@SuperBuilder
class Employee extends Person {

    private UUID id;
    private double salary;
    private boolean active;
    private List<String> skills;
}
