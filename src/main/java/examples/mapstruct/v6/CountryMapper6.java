package examples.mapstruct.v6;

import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("COUNTRY_v6")
@Mapper(uses = CityMapper6.class)
interface CountryMapper6 {

    CountryEntity fromModel(Country model);
}
