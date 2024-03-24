package org.javaacademy.storage.consumer;

import org.javaacademy.storage.item.Vodka;
import org.javaacademy.storage.storage.Storage;
import org.springframework.stereotype.Component;

@Component
public class Petrovich implements Consumer {

    private Storage storage;

    public Petrovich(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void accept() {
        System.out.println("Петрович взял товар: " + storage.getItem(Vodka.class, true));
    }
}
