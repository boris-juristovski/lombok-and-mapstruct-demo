package examples.mapstruct.v2;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
class CountryEntity {

    private UUID id;
    private String name1;
    private String capitalTown; // this one
    private String currency;
    private int population;
}
