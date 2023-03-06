package com.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liucui
 * @date 2023/3/6  22:54
 */

@Slf4j
public class App {
    public static void main(String[] args) {
        PizzaStore nyStore = new NyPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        log.info("You order a {}", pizza.getName());
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        pizza = chicagoStore.createPizza("cheese");
        log.info("You order a {}", pizza.getName());
    }
}
