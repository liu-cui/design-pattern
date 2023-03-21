package com.simple;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liucui
 * @date 2023/3/21  21:49
 */

@Slf4j
public class Coffee {
    public void prepareRecipe(){
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    private void addSugarAndMilk() {
        log.info("Adding Sugar and Milk");
    }

    private void pourInCup() {
        log.info("Pouring into cup");
    }

    private void brewCoffeeGrinds() {
        log.info("Dripping Coffee through filter");
    }

    private void boilWater() {
        log.info("Boiling water");
    }
}
