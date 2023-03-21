package com.template;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liucui
 * @date 2023/3/21  22:51
 */
@Slf4j
public abstract class CaffeineBeverageWithHook {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }

    }

    protected abstract void addCondiments();

    protected abstract void brew();

    public boolean customerWantsCondiments() {
        return true;
    }


    public void pourInCup() {
        log.info("Pouring into cup");
    }

    public void boilWater() {
        log.info("Boiling water");
    }
}
