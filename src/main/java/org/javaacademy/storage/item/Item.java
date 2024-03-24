package org.javaacademy.storage.item;

public abstract class Item {
    protected boolean isBroken = false;

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }
}
