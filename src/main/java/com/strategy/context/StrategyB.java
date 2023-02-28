package com.strategy.context;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liucui
 * @date 2023/2/28  23:27
 */
@Slf4j
public class StrategyB implements Strategy{
    @Override
    public void execute() {
        log.info("execute strategy B");
    }
}
