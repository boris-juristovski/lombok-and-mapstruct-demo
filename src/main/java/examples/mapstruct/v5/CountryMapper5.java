package examples.mapstruct.v5;

import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("v5")
@Mapper
interface CountryMapper5 {

    CountryEntity fromModel(Country model);
}
