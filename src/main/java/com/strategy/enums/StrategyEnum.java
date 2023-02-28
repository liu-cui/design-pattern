package com.strategy.enums;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liucui
 */
@Slf4j
public enum StrategyEnum {
    STRATEGY_A{
        @Override
        public void execute() {
            log.info("execute strategy A");
        }
    },
    STRATEGY_B{
        @Override
        public void execute() {
            log.info("execute strategy B");
        }
    };



    public abstract void execute();
}
