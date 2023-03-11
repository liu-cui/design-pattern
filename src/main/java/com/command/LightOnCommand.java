package com.command;

/**
 * @author cuiliu
 */
public class LightOnCommand implements Command{

    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }
}
