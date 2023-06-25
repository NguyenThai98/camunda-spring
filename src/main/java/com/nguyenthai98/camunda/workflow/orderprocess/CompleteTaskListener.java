package com.nguyenthai98.camunda.workflow.orderprocess;

import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;

public class CompleteTaskListener implements TaskListener {
    @Override
    public void notify(DelegateTask delegateTask) {
        System.out.println("delegateTask.getDescription() = " + "CompleteTaskListener");
    }
}
