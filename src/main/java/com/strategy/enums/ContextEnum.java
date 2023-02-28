package com.strategy.enums;

/**
 * @author liucui
 * @date 2023/2/28  23:30
 */

public class ContextEnum {
    StrategyEnum strategy;

    public ContextEnum(StrategyEnum strategy){
        this.strategy = strategy;
    }

    public void setStrategy(StrategyEnum strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(){
        strategy.execute();
    }
}

