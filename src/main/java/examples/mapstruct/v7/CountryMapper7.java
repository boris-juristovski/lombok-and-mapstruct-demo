package examples.mapstruct.v7;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("v7")
@Mapper
interface CountryMapper7 {

    @Mapping(expression = "java(doubleThePopulation(model.getPopulation()))", target = "population")
    CountryEntity fromModel(Country model);

    default int doubleThePopulation(int population) {
        return population * 2;
    }
}
