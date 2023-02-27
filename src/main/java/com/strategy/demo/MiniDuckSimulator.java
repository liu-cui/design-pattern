package com.strategy.demo;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liucui
 * @date 2023/2/18  19:12
 */
@Slf4j
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();

        String name = mallardDuck.getClass().getName();
        log.info(name);

    }
}
