package com.strategypattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cuiliu
 */
public class StrategyContext {
    private static final Map<String, Strategy> registerMap = new HashMap<>();

    public static void registerStrategy(String type, Strategy strategy){
        registerMap.putIfAbsent(type, strategy);
    }

    public static Strategy getStrategy(String type){
        return registerMap.get(type);
    }
}
