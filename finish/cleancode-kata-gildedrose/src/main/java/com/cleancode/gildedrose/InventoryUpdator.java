package com.cleancode.gildedrose;

public class InventoryUpdator {
    Item[] items;

    public InventoryUpdator(Item[] items) {
        this.items = items;
    }

    public void update() {
        for (int i = 0; i < items.length; i++) {
            updateItem(items[i]);
        }
    }

    private void updateItem(Item item) {
        new UpdateStrategy().update(item);
    }

}
