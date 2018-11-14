package com.cleancode.gildedrose;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConjuredTest {

    private UpdateStrategy updateStrategy;
    private Item item;

    @Before
    public void setUp() {
        updateStrategy = new ConjuredStrategy();
        item = new Item("Conjured Mana Cake", 3, 6);
    }

    @Test
    public void testConjuredItem() {
        updateStrategy.update(item);
        Assert.assertEquals(4, item.quality);
    }
}
