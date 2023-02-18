package com.demo;

/**
 * @author liucui
 * @date 2023/2/18  19:19
 */

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
