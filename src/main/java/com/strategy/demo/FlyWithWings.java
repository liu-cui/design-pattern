package com.strategy.demo;

/**
 * @author liucui
 * @date 2023/2/18  18:57
 */

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
