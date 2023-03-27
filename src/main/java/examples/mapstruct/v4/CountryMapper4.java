package examples.mapstruct.v4;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("v4")
@Mapper
interface CountryMapper4 {

    @Mapping(source = "model.capital.locationMetadata.superSecretLocation", target = "someLocation")
    CountryEntity fromModel(Country model);
}
