package com.nguyenthai98.camunda.workflow.orderprocess;

import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;

public class TimeoutTaskListener implements TaskListener {
    @Override
    public void notify(DelegateTask delegateTask) {
        System.out.println("delegateTask.getDescription() = " + "TimeoutTaskListener");
    }
}
