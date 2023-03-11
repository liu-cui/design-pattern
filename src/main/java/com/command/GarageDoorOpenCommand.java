package com.command;

import lombok.extern.slf4j.Slf4j;

/**
 * @author cuiliu
 */
@Slf4j
public class GarageDoorOpenCommand implements Command{
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.open();
    }
}
