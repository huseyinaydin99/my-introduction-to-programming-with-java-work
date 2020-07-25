package com.huseyinaydin;

public interface IEntityRepository<T extends IEntity> {
    void add(T object);
    void delete(T object);
    void update(T object);
}
