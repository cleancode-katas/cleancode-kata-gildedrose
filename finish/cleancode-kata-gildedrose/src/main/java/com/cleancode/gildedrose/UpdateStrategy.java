package com.cleancode.gildedrose;

public class UpdateStrategy {

    public void update(Item item) {
        updateQualityIgnoringSellIn(item);
        decrementSellIn(item);
        adjustQualityForNegativeSellIn(item);
    }

    private void adjustQualityForNegativeSellIn(Item item) {
        if (item.sellIn < 0) {
            if (!item.name.equals("Aged Brie")) {
                if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (item.quality > 0) {
                        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                            item.quality = item.quality - 1;
                        }
                    }
                } else {
                    item.quality = item.quality - item.quality;
                }
            } else {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                }
            }
        }
    }

    private void decrementSellIn(Item item) {
        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.sellIn = item.sellIn - 1;
        }
    }

    private void updateQualityIgnoringSellIn(Item item) {
        if (!item.name.equals("Aged Brie")
                && !item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (item.quality > 0) {
                if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                    item.quality = item.quality - 1;
                }
            }
        } else {
            if (item.quality < 50) {
                item.quality = item.quality + 1;

                if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
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
    }
}
