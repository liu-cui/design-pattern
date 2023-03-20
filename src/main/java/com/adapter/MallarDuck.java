package com.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liucui
 * @date 2023/3/20  22:29
 */
@Slf4j
public class MallarDuck implements Duck {
    @Override
    public void quack() {
        log.info("Quack");
    }

    @Override
    public void fly() {
        log.info("I'm flying");
    }
}
