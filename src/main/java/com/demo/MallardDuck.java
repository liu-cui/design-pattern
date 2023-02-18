package com.demo;

/**
 * @author liucui
 * @date 2023/2/18  19:10
 */

public class MallardDuck extends Duck{
    @Override
    public void display() {
        System.out.println("I am real Mallard");
    }

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
}
