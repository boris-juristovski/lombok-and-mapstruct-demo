package examples.spring.repository;

import examples.spring.v1.CarEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CarRepo {

    public CarEntity getCarFromDb() {
        return CarEntity.builder()
                .id(UUID.randomUUID())
                .name("BMW")
                .manufacturedYear(2003)
                .build();
    }
}
