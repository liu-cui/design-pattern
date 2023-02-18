package com.demo;

/**
 * @author liucui
 * @date 2023/2/18  19:03
 */

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Silence");
    }
}
