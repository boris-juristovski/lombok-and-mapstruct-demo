package examples.spring.controller;

import examples.spring.core.Converter;
import examples.spring.repository.CarRepo;
import examples.spring.v1.Car;
import examples.spring.v1.CarEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/examples")
public class ExampleController {

    private final CarRepo repo;
    private final Converter<CarEntity, Car> converter;

    @GetMapping
    public Car getCar() {
        final CarEntity entity = repo.getCarFromDb();

        return converter.toModel(entity);
    }
}
