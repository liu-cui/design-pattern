package com.template;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liucui
 * @date 2023/3/21  22:06
 */

@Slf4j
public abstract class CaffeineBeverage {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected abstract void addCondiments();

    protected abstract void brew();
    
    public void boilWater(){
        log.info("Boiling water");
    }
    
    public void pourInCup(){
        log.info("Pouring into cup");
    }
}
