package com.template;

import org.jetbrains.annotations.TestOnly;

/**
 * @author liucui
 * @date 2023/3/21  21:52
 */

public class App {
    public static void main(String[] args) {
        coffeeHook();
    }

    @TestOnly
    private static void coffee(){
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }

    @TestOnly
    private static void tea(){
        Tea tea = new Tea();
        tea.prepareRecipe();
    }

    private static void coffeeHook(){
        CoffeeWithHook coffee = new CoffeeWithHook();
        coffee.prepareRecipe();
    }

}
