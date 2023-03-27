package examples.lombok.v7;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Builder
class Employee extends Person {

    private UUID id;
    private double salary;
    private boolean active;
    private List<String> skills;
}
