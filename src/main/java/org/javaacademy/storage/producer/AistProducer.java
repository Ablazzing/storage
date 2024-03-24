package org.javaacademy.storage.producer;

import org.javaacademy.storage.item.Bicycle;
import org.javaacademy.storage.storage.Storage;
import org.springframework.stereotype.Component;

@Component
public class AistProducer implements Producer<Bicycle> {
    private Storage storage;

    public AistProducer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public Bicycle supply() {
        return (Bicycle) storage.addItem(new Bicycle());
    }
}
