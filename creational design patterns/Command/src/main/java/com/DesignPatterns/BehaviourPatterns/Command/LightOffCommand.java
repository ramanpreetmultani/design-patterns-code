package com.DesignPatterns.BehaviourPatterns.Command;

import com.DesignPatterns.BehaviourPatterns.Receiver.Light;

public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }
    public void execute() {
        light.switchOff();
    }
}
