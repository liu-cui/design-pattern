package com.strategy.context;

/**
 * @author liucui
 * @date 2023/2/28  23:27
 */

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(){
        strategy.execute();
    }
}
