package com.DesignPatterns.BehaviourPatterns.ChainofResponsibilty;

public class ErrorLogger extends Logger {

    public ErrorLogger(int level){
        this.level = level;
    }

    protected void displayLogInfo(final String log){
        System.out.println("ERROR LOGGER INFO: "+log);
    }
}
