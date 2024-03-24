package org.javaacademy.storage.worker;

import org.javaacademy.storage.item.Item;

public class Worker {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public void uploadItemOnStorage(Item item) {
        System.out.println(name + " принял товар");
    }

    public void brokeItem(Item item) {
        System.out.println(name + " сломал товар");
        item.setBroken(true);
    }
}
