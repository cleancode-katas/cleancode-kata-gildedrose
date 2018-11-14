package com.cleancode.gildedrose;

public class AgedBrieStrategy extends UpdateStrategy {
    @Override
    public void update(Item item) {
        updateQualityIgnoringSellIn(item);
        decrementSellIn(item);
        adjustQualityForNegativeSellIn(item);
    }

    private void adjustQualityForNegativeSellIn(Item item) {
        if (item.sellIn < 0) {
            if (item.quality < 50) {
                item.quality = item.quality + 1;
            }
        }
    }

    private void decrementSellIn(Item item) {
        item.sellIn = item.sellIn - 1;
    }

    private void updateQualityIgnoringSellIn(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }
}
