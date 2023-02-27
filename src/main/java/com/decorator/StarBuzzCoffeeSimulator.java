package com.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author cuiliu
 */
@Slf4j
public class StarBuzzCoffeeSimulator {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        log.info(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        log.info(beverage1.getDescription() + " $" + beverage1.cost());
    }
}
