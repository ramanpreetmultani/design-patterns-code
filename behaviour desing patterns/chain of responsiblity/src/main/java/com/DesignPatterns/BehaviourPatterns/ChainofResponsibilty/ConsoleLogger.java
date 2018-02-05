package com.DesignPatterns.BehaviourPatterns.ChainofResponsibilty;

public class ConsoleLogger extends Logger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    protected void displayLogInfo(final String log){
        System.out.println("CONSOLE LOGGER INFO: "+log);
    }
}
