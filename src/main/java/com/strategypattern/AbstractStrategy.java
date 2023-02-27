package com.strategypattern;

/**
 * @author cuiliu
 */
public abstract class AbstractStrategy implements Strategy{
    /***
     * 策略类调用注册
     */
    public void register(){
        StrategyContext.registerStrategy(getClass().getSimpleName(), this);
    }
}
