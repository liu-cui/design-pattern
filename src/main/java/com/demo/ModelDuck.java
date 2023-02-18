package com.demo;

/**
 * @author liucui
 * @date 2023/2/18  19:17
 */

public class ModelDuck extends Duck{
    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
}
