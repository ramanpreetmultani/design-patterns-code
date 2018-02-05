package com.DesignPatterns.BehaviourPatterns.ChainofResponsibilty;

public class DebugLogger extends Logger {

    public DebugLogger(int level){
        this.level = level;
    }

    protected void displayLogInfo(final String log){
        System.out.println("DEBUG LOGGER INFO: "+log);
    }
}
