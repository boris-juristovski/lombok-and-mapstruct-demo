package examples.spring.v1;

// TODO - uncomment if want to "override" default converter

//import examples.spring.core.Converter;
//import examples.spring.core.ConverterDecorator;
//import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Service;
//
//@Primary
//@Service
//public class CarConversionServiceDecorator extends ConverterDecorator<CarEntity, Car> {
//
//    // e.g
//    //@PersistenceContext protected EntityManager entityManager;
//
//    public CarConversionServiceDecorator(Converter<CarEntity, Car> conversionService) {
//        super(conversionService);
//    }
//
//    @Override
//    public Car toModel(CarEntity entity) {
//        Car model = super.toModel(entity);
//
//        model.setName("Audi");
//
//        return model;
//    }
//}
