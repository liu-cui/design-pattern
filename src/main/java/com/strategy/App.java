package com.strategy;
import com.strategy.context.Context;
import com.strategy.context.StrategyA;
import com.strategy.context.StrategyB;
import com.strategy.enums.ContextEnum;
import com.strategy.enums.StrategyEnum;
import com.strategy.factory.ContextFactory;
import com.strategy.factory.Strategy;
import com.strategy.factory.StrategyFactory;
import lombok.extern.slf4j.Slf4j;

/**
 * @author liucui
 * @date 2023/2/28  23:31
 */
@Slf4j
public class App {
    public static void main(String[] args) {
        executeContext();
        executeEnum();
        executeFactory();
    }

    public static void executeContext(){
        Context context = new Context(new StrategyA());
        context.executeStrategy();
        context.setStrategy(new StrategyB());
        context.executeStrategy();
    }

    public static void executeEnum(){
        ContextEnum context = new ContextEnum(StrategyEnum.STRATEGY_B);
        context.executeStrategy();
        context.setStrategy(StrategyEnum.STRATEGY_A);
        context.executeStrategy();
    }

    public static void executeFactory(){
        StrategyFactory factory = StrategyFactory.getInstance();
        Strategy strategy = factory.createStrategy("A");
        ContextFactory context = new ContextFactory(strategy);
        context.executeStrategy();
        strategy = factory.createStrategy("B");
        context.setStrategy(strategy);
        context.executeStrategy();

    }
}
