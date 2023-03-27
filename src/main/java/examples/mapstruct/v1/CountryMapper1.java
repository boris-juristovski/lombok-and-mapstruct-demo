package examples.mapstruct.v1;

import org.mapstruct.Mapper;

@Mapper
interface CountryMapper1 {

    CountryEntity fromModel(Country model);
}
