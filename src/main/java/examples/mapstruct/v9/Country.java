package examples.mapstruct.v9;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
class Country {

    private UUID id;
    private String name;
    private String capital;
    private String currency;
    private int population;
}
