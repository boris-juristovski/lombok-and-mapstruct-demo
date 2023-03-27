package examples.mapstruct.v6;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
class CountryEntity {

    private UUID id;
    private String name;
    private CityEntity capital;
    private String currency;
    private int population;
}
