package com.factory;

/**
 * @author liucui
 * @date 2023/3/6  23:31
 */

public class NyPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        /* use enum field avoid spell error*/
        if ("cheese".equals(item)) {
            return new NyStyleCheesePizza();
        } else if ("veggie".equals(item)) {
            return new NyStyleVeggiePizza();
        } else if ("clam".equals(item)) {
            return new NyStyleClamPizza();
        } else {
            return null;
        }
    }
}
