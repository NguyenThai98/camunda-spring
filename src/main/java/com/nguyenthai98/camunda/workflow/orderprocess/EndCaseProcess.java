package com.nguyenthai98.camunda.workflow.orderprocess;

import org.camunda.bpm.engine.delegate.*;
import org.camunda.bpm.engine.task.IdentityLink;

import java.util.Set;
import java.util.logging.Logger;

public class EndCaseProcess implements JavaDelegate {

    private static final Logger log = Logger.getLogger(EndCaseProcess.class.getName());

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        System.out.println("execution.getEventName() = " + execution.getEventName());
    }
}
