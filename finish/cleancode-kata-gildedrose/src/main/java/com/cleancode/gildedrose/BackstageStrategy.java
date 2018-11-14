package com.cleancode.gildedrose;

public class BackstageStrategy extends UpdateStrategy {
    @Override
    public void update(Item item) {
        updateQualityIgnoringSellIn(item);
        decrementSellIn(item);
        adjustQualityForNegativeSellIn(item);
    }

    private void adjustQualityForNegativeSellIn(Item item) {
        if (item.sellIn < 0) {
            item.quality = item.quality - item.quality;
        }
    }

    private void decrementSellIn(Item item) {
        item.sellIn = item.sellIn - 1;
    }

    private void updateQualityIgnoringSellIn(Item item) {

        if (item.quality < 50) {
            item.quality = item.quality + 1;

            if (item.sellIn < 11) {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                }
            }

            if (item.sellIn < 6) {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                }
            }
        }

    }
}
