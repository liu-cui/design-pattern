package com.strategy.demo;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liucui
 * @date 2023/2/18  19:03
 */

@Slf4j
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        log.info("Silence");
    }
}
