package examples.lombok.v5;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@EqualsAndHashCode(callSuper=true)
@Getter
@Setter
@NoArgsConstructor
class EmployeeWithEqualsV2 extends EmployeeWithEquals {

}
