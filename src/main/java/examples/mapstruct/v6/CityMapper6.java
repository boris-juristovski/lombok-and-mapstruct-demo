package examples.mapstruct.v6;

import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("CITY_v6")
@Mapper
interface CityMapper6 {

    CityEntity fromModel(City model);
}
