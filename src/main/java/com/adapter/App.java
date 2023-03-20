package com.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * @author liucui
 * @date 2023/3/20  22:39
 */
@Slf4j
public class App {
    public static void main(String[] args) {
        MallarDuck duck = new MallarDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        log.info("The Turkey says ...");
        turkey.gobble();
        turkey.fly();
        log.info("The Duck says...");
        testDuck(duck);
        log.info("The TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
