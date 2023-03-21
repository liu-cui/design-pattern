package com.template;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liucui
 * @date 2023/3/21  22:08
 */

@Slf4j
public class Tea extends CaffeineBeverage {
    @Override
    protected void addCondiments() {
        log.info("Steeping the tea");
    }

    @Override
    protected void brew() {
        log.info("Adding lemon");
    }
}
