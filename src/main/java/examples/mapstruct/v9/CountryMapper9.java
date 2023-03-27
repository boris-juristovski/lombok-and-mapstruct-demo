package examples.mapstruct.v9;

import org.apache.commons.collections4.CollectionUtils;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Collection;

@Qualifier("v9")
@Mapper
interface CountryMapper9 {

    int MIN_POPULATION = 2_000_000;

    CountryEntity fromModel(Country model);

    default Collection<CountryEntity> fromModels(Collection<Country> models) {
        return CollectionUtils.emptyIfNull(models).stream()
                .filter(model -> model.getPopulation() < MIN_POPULATION)
                .map(this::fromModel)
                .toList();
    }
}
