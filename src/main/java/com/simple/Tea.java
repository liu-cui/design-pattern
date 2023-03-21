package com.simple;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liucui
 * @date 2023/3/21  21:54
 */
@Slf4j
public class Tea {
    public void prepareRecipe(){
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    private void addLemon() {
        log.info("Adding lemon");
    }

    private void pourInCup() {
        log.info("Pouring into cup");
    }

    private void steepTeaBag() {
        log.info("Steeping the tea");
    }

    private void boilWater() {
        log.info("Boiling water");
    }


}
