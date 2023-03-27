package examples.lombok.v10;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

import java.time.LocalDate;
import java.util.UUID;

@RequiredArgsConstructor
// experimental
@Accessors(fluent = true) @Getter
class Employee {

    private final UUID id;
    private final String name;
    private final LocalDate dateOfBirth;
}
