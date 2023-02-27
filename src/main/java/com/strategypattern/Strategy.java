package com.strategypattern;

/**
 * @author cuiliu
 */
public interface Strategy {
    /**
     * @param params 传递个数可变的实惨
     */
    void issue(Object ... params);
}
