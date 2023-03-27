package examples.spring.v1;

import examples.spring.core.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class CarEntity extends BaseEntity {

    private String name;
    private int manufacturedYear;
}
