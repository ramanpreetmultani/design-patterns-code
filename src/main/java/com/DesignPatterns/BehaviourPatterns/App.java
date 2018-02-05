package com.DesignPatterns.BehaviourPatterns;

import com.DesignPatterns.BehaviourPatterns.ChainofResponsibilty.ConsoleLogger;
import com.DesignPatterns.BehaviourPatterns.ChainofResponsibilty.DebugLogger;
import com.DesignPatterns.BehaviourPatterns.ChainofResponsibilty.ErrorLogger;
import com.DesignPatterns.BehaviourPatterns.ChainofResponsibilty.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Logger doChaining() {
        Logger consoleLogger = new ConsoleLogger(Logger.CONSOLE_LOG);

        Logger errorLogger = new ErrorLogger(Logger.ERR_LOG);
        consoleLogger.setNextLevelLogger(errorLogger);

        Logger debugLogger = new DebugLogger(Logger.DEBUG_LOG);
        errorLogger.setNextLevelLogger(debugLogger);

        return consoleLogger;
    }
    public static void main( String[] args )
    {
        Logger logger = doChaining();
        logger.logMessage(Logger.CONSOLE_LOG,"Enter the sequence of values ");
        logger.logMessage(Logger.ERR_LOG, "An error is occured now");
        logger.logMessage(Logger.DEBUG_LOG, "This was the error now debugging is compeled");
    }
}
