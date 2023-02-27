package com.strategy;

import com.strategy.demo.Duck;
import com.strategy.demo.FlyRocketPowered;
import com.strategy.demo.MallardDuck;
import com.strategy.demo.ModelDuck;
import com.strategy.enums.DuckEnumStrategy;
import lombok.extern.slf4j.Slf4j;

/**
 * @author liucui
 * @date 2023/2/27  22:16
 */

@Slf4j
public class App {
    public static void main(String[] args) {
        DuckEnumStrategy strategy = DuckEnumStrategy.valueOf("modelDuck");
        log.info(String.valueOf(strategy));
    }
}
