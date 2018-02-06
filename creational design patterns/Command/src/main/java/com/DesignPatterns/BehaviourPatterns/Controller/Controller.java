package com.DesignPatterns.BehaviourPatterns.Controller;

import com.DesignPatterns.BehaviourPatterns.Command.Command;

public class Controller {

    private Command command;


    public void setCommand(Command command){
        this.command=command;
    }
    public void invoke(){
        command.execute();
    }
}
