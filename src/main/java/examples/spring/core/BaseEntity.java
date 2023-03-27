package examples.spring.core;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@Getter
@Setter
@SuperBuilder
public abstract class BaseEntity implements Entity {

    private UUID id;
}
