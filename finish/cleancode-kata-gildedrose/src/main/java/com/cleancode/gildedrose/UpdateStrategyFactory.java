package com.cleancode.gildedrose;

import java.util.HashMap;
import java.util.Map;

public class UpdateStrategyFactory {

    private static final Map<String, UpdateStrategy> strategyMap = createStrategyMap();

    private static Map<String, UpdateStrategy> createStrategyMap() {
        Map<String, UpdateStrategy> map = new HashMap<>();
        map.put("Aged Vrie", new AgedBrieStrategy());
        map.put("Sulfuras, Hand of Ragnaros", new SulfurasStrategy());
        map.put("Backstage passes to a TAFKAL80ETC concert", new BackstageStrategy());
        return map;
    }

    public static UpdateStrategy create(String name) {
        UpdateStrategy updateStrategy = strategyMap.get(name);
        if( null == updateStrategy) {
            updateStrategy = new NormalStrategy();
        }
        return updateStrategy;
    }
}
