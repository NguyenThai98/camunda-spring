package com.nguyenthai98.camunda.workflow.orderprocess;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.logging.Logger;


public class LogSeviceTask implements JavaDelegate {
    private static final Logger log = Logger.getLogger(LogSeviceTask.class.getName());

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        log.info("LogSeviceTask vars: "+ execution.getVariables().toString());
    }
}
