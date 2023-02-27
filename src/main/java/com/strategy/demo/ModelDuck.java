package com.strategy.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author liucui
 * @date 2023/2/18  19:17
 */
@Slf4j
public class ModelDuck extends Duck{
    @Override
    public void display() {
        log.info("I'm a model duck");
    }

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
}
