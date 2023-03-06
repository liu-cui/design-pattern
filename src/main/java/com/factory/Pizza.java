package com.factory;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liucui
 * @date 2023/3/6  22:41
 */
@Slf4j
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List toppings = new ArrayList();

    void prepare(){
        log.info("Preparing {}", name);
        log.info("Tossing dough...");
        log.info("Adding sauce...");
        log.info("Adding toppings: ");
        for (int i = 0; i < toppings.size(); i++) {
            log.info("{}", toppings.get(i));
        }
    }

    void bake(){
        log.info("Bake for 25 minutes at 350");
    }

    void cut(){
        log.info("Cutting the pizza into diagonal slices");
    }

    void box(){
        log.info("Place pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }
}
