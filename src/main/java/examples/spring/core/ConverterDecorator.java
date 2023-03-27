package examples.spring.core;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class ConverterDecorator<E extends Entity, M extends Model>
implements Converter<E, M> {

    private final Converter<E, M> decoratedService;

    @Override
    public E fromModel(M model) {
        return decoratedService.fromModel(model);
    }

    @Override
    public M toModel(E entity) {
        return decoratedService.toModel(entity);
    }
}
