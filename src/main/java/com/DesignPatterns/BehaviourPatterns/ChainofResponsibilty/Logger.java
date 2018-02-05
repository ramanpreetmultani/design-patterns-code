package com.DesignPatterns.BehaviourPatterns.ChainofResponsibilty;

public abstract class Logger {
    public static final int CONSOLE_LOG = 1;
    public static final int ERR_LOG = 2;
    public static final int DEBUG_LOG = 3;

    private Logger nextLevelLogger;
    protected int level;
    public void setNextLevelLogger(Logger logger){
        this.nextLevelLogger = logger;
    }

    protected abstract void displayLogInfo(final String log);

    public void logMessage(final int level,final String msg){
        if(this.level <= level){
            displayLogInfo(msg);
            if(nextLevelLogger != null){
                nextLevelLogger.logMessage(level,msg);
            }
        }
    }
}
