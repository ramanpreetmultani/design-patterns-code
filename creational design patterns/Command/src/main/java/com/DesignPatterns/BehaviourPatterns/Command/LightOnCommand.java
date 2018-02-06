package com.DesignPatterns.BehaviourPatterns.Command;

import com.DesignPatterns.BehaviourPatterns.Receiver.Light;

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }
    public void execute() {
        light.switchOn();
    }
}
