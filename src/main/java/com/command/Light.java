package com.command;


import lombok.extern.slf4j.Slf4j;

/**
 * @author cuiliu
 */
@Slf4j
public class Light {
    public void on(){
        log.info("Light is On");
    }

    public void off(){
        log.info("Light is Off");
    }
}
