package com.strategy.factory;

/**
 * @author liucui
 * @date 2023/2/28  23:42
 */

public class ContextFactory {
    private Strategy strategy;
    public ContextFactory(Strategy strategy){
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(){
        strategy.execute();
    }
}
