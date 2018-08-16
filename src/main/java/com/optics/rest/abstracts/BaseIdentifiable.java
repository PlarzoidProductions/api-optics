package com.optics.rest.abstracts;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public abstract class BaseIdentifiable<T extends BaseIdentifiable<T>> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    public UUID getId() {
        return id;
    }

    @SuppressWarnings("unchecked")
    public T setId(UUID id) {
        this.id = id;
        return (T) this;
    }
}