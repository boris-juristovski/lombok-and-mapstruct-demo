package examples.spring.core;

public interface Converter<E extends Entity, M extends Model> {

    E fromModel(M model);

    M toModel(E entity);
}
