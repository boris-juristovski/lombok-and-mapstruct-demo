package examples.spring.v1;

import examples.spring.core.BaseModel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class Car extends BaseModel {

    private String name;
    private int manufacturedYear;
}
