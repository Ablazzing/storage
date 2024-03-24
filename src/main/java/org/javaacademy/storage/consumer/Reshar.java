package org.javaacademy.storage.consumer;

import org.javaacademy.storage.item.Bicycle;
import org.javaacademy.storage.storage.Storage;
import org.springframework.stereotype.Component;

@Component
public class Reshar implements Consumer {
    private Storage storage;

    public Reshar(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void accept() {
        storage.getItem(Bicycle.class, false);
    }
}
