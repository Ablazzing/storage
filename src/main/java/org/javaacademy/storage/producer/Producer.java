package org.javaacademy.storage.producer;

import org.javaacademy.storage.item.Item;

public interface Producer<T extends Item> {
    T supply();
}
