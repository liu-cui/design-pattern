package com.strategy.demo;

/**
 * @author liucui
 * @date 2023/2/18  19:04
 */

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
