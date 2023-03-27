package examples.mapstruct.v3;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("v3")
@Mapper
interface CountryMapper3 {

    @Mapping(ignore = true, target = "name")
    CountryEntity fromModel(Country model);
}
