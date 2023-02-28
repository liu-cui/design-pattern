package com.strategy.factory;

/**
 * @author liucui
 * @date 2023/2/28  23:36
 */

public class StrategyFactory {
    private static final StrategyFactory INSTANCE = new StrategyFactory();
    private StrategyFactory(){}

    public static StrategyFactory getInstance() {
        return INSTANCE;
    }

    public Strategy createStrategy(String strategyType){
        if("A".equals(strategyType)){
            return new StrategyA();
        }else if("B".equals(strategyType)){
            return new StrategyB();
        }else {
            throw new IllegalArgumentException("Unsupported strategy type: " + strategyType);
        }
    }
}
