package com.observer;

/**
 * @author cuiliu
 */
public interface Observer {
    public void update(double temperature, double humidity, double pressure);
}
