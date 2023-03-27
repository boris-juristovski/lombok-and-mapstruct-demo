package examples.lombok.v12;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.With;

import java.time.LocalDate;
import java.util.UUID;

@ToString
@With
@RequiredArgsConstructor
class Employee {

    private final UUID id;
    private final String name;
    private final LocalDate dateOfBirth;
}
