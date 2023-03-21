package com.template;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liucui
 * @date 2023/3/21  22:10
 */
@Slf4j
public class Coffee extends CaffeineBeverage {
    @Override
    protected void addCondiments() {
        log.info("Dripping Coffee through filter");
    }

    @Override
    protected void brew() {
        log.info("Adding Sugar and Milk");
    }
}
