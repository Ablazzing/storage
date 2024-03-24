package org.javaacademy.storage.storage;

import org.javaacademy.storage.item.Item;
import org.javaacademy.storage.worker.Worker;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Storage {
    private final Map<Class<? extends Item>, List<Item>> items = new HashMap<>();
    private List<Worker> workers;
    private int counterUpload = 0;
    private int brokenItemsCounter = 0;

    public Storage(List<Worker> workers) {
        this.workers = workers;
    }

//    public Storage(@Qualifier("zelya") Worker worker1, @Qualifier("zelya") Worker worker2) {
//        this.worker1 = worker1;
//        this.worker2 = worker2;
//    }

    public Item addItem(Item item) {
        Worker worker = workers.get(counterUpload);
        worker.uploadItemOnStorage(item);
        brokenItemsCounter++;
        if (brokenItemsCounter % 2 == 0) {
            worker.brokeItem(item);
        }
        counterUpload++;
        if (counterUpload >= workers.size()) {
            counterUpload = 0;
        }
        List<Item> itemsByClass = items.getOrDefault(item.getClass(), new ArrayList<>());
        itemsByClass.add(item);
        items.put(item.getClass(), itemsByClass);
        return item;
    }

    public Item getItem(Class<? extends Item> itemClass, boolean isBroken) {
        List<Item> itemsByClass = items.get(itemClass);
        for (int i = 0; i < itemsByClass.size(); i++) {
            if (itemsByClass.get(i).isBroken() == isBroken) {
                return itemsByClass.remove(i);
            }
        }
        throw new RuntimeException("Товара нет с таким состоянием");
    }
}
