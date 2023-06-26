package com.nguyenthai98.camunda.workflow.orderprocess;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Named;
import java.util.logging.Logger;


@Named("ResultSeviceTask")
public class ResultSeviceTask implements JavaDelegate {
    private static final Logger log = Logger.getLogger(ResultSeviceTask.class.getName());

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        System.out.println("log.info(); = ResultSeviceTask");
    }

}
