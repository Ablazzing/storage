package org.javaacademy.storage.producer;

import org.javaacademy.storage.item.Vodka;
import org.javaacademy.storage.storage.Storage;
import org.springframework.stereotype.Component;

@Component
public class AbsolutProducer implements Producer<Vodka> {
    private Storage storage;

    public AbsolutProducer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public Vodka supply() {
        return (Vodka) storage.addItem(new Vodka());
    }
}
