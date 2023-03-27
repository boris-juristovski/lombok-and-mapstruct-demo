package examples.mapstruct.v2;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("v2")
@Mapper
interface CountryMapper2 {

    @Mapping(source = "model.capital", target = "capitalTown")
    CountryEntity fromModel(Country model);
}
