package com.strategy.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author liucui
 * @date 2023/2/18  19:10
 */

@Slf4j
public class MallardDuck extends Duck{
    @Override
    public void display() {
        log.info("I am real Mallard");
    }

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
}
