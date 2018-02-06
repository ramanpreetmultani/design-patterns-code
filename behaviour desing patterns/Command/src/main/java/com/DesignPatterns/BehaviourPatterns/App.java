package com.DesignPatterns.BehaviourPatterns;

import com.DesignPatterns.BehaviourPatterns.Command.Command;
import com.DesignPatterns.BehaviourPatterns.Command.LightOffCommand;
import com.DesignPatterns.BehaviourPatterns.Command.LightOnCommand;
import com.DesignPatterns.BehaviourPatterns.Controller.Controller;
import com.DesignPatterns.BehaviourPatterns.Receiver.Light;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Controller controller = new Controller();
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        controller.setCommand(lightOnCommand);
        controller.invoke();

        controller.setCommand(lightOffCommand);
        controller.invoke();
    }
}
