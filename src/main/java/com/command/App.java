package com.command;

/**
 * @author cuiliu
 */
public class App {
    public static void main(String[] args) {
        remoteControllerTest();
    }

    public static void remoteControllerTest(){
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(lightOff);
        remote.buttonWasPressed();
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        remote.setCommand(garageDoorOpen);
        remote.buttonWasPressed();
        remote.undoButtonWasPressed();
    }
}
