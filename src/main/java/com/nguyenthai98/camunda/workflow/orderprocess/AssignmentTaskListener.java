package com.nguyenthai98.camunda.workflow.orderprocess;

import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;
import org.camunda.bpm.engine.task.IdentityLink;

import java.util.Set;
import java.util.logging.Logger;

public class AssignmentTaskListener implements TaskListener {

    private static final Logger log = Logger.getLogger(AssignmentTaskListener.class.getName());

    @Override
    public void notify(DelegateTask task) {

        if(task.getAssignee() != null) {
            String assignee = task.getAssignee();

            log.info("The assignee for task " + task.getId() + " is: " + assignee);
            Set<IdentityLink> identityLinks = task.getCandidates();
            if(identityLinks.isEmpty())
                log.info("No candidate users or groups exist for this User Task. Id: " + task.getId());
            else {
                for (IdentityLink identityLink : identityLinks) {
                    if(identityLink.getGroupId() != null)
                        log.info("Task " + task.getId() + " has an identity link for a group with id: "
                                + identityLink.getGroupId());
                    else if(identityLink.getUserId() != null)
                        log.info("Task " + task.getId() + " has an identity link for a user with id: "
                                + identityLink.getUserId());
                }
            }
        }
    }
}
