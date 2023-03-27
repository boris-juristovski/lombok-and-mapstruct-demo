package examples.spring.v1;

import examples.spring.core.Converter;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CarConversionService extends Converter<CarEntity, Car> {

}
