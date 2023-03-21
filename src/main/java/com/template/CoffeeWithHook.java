package com.template;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author liucui
 * @date 2023/3/21  22:55
 */
@Slf4j
public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    protected void addCondiments() {
        log.info("Adding Sugar and Milk");
    }

    @Override
    protected void brew() {
        log.info("Dripping Coffee through filter");
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = null;
        log.info("Would you like milk and sugar with your coffee (y/n)?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
