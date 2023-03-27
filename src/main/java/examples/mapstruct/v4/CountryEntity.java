package examples.mapstruct.v4;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
class CountryEntity {

    private UUID id;
    private String name;
    private String capitalCity;
    private String someLocation;
    private String currency;
    private int population;
}
