package com.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liucui
 * @date 2023/3/6  22:52
 */
@Slf4j
public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza(){
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    void cut() {
        log.info("Cutting the pizza into square slices");
    }
}
