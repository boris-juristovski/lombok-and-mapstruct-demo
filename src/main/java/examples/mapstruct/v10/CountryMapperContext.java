package examples.mapstruct.v10;

import lombok.Getter;
import org.mapstruct.AfterMapping;
import org.mapstruct.BeforeMapping;
import org.mapstruct.MappingTarget;

@Getter
public class CountryMapperContext {

    private int contextData = 0;

    @BeforeMapping
    public void prepareData(Country model) {
        this.contextData = model.getPopulation() * 2;
    }

    @AfterMapping
    public void someMappingOrCalculation(@MappingTarget CountryEntity entity) {
        entity.setPopulation(contextData);
    }

    @AfterMapping
    public void cleanUpData() {
        this.contextData = 0;
    }
}
