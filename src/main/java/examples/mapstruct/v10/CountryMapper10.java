package examples.mapstruct.v10;

import org.mapstruct.Context;
import org.mapstruct.Mapper;

import java.util.Collection;

@Mapper
interface CountryMapper10 {

    CountryEntity fromModel(Country model, @Context CountryMapperContext context);

    Collection<CountryEntity> fromModels(Collection<Country> models, @Context CountryMapperContext context);
}
