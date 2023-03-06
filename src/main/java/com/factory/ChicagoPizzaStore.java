package com.factory;

/**
 * @author liucui
 * @date 2023/3/6  23:47
 */

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        if ("cheese".equals(item)) {
            return new ChicagoStyleCheesePizza();
        } else if ("veggie".equals(item)) {
            return new ChicagoStyleVeggiePizza();
        } else if ("clam".equals(item)) {
            return new ChicagoStyleClamPizza();
        } else {
            return null;
        }
    }
}
