package com.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liucui
 * @date 2023/3/20  22:34
 */

@Slf4j
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        log.info("Gobble gobble");
    }

    @Override
    public void fly() {
        log.info("I'm flying a short distance");
    }
}
