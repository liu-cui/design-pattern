package com.strategy.demo;

/**
 * @author liucui
 * @date 2023/2/18  18:58
 */

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can not fly");
    }
}
