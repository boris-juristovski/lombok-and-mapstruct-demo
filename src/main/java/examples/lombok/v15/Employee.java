package examples.lombok.v15;

import lombok.AllArgsConstructor;
import lombok.Value;

import java.util.UUID;

@Value
@AllArgsConstructor(staticName = "of")
class Employee {

    private UUID id;
    private String name;
}
