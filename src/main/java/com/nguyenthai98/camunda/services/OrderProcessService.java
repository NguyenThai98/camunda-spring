package com.nguyenthai98.camunda.services;

import com.nguyenthai98.camunda.workflow.keyprocess.KeyProcess;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.TaskService;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class OrderProcessService {

    private final RuntimeService runtimeService;
    private final TaskService taskService;

    public OrderProcessService(RuntimeService runtimeService, TaskService taskService) {
        this.runtimeService = runtimeService;
        this.taskService = taskService;
    }

    public String orderProcessInstance(){
        String processKey = UUID.randomUUID().toString();
        Map<String, Object> variables = new HashMap<String,Object>();
        variables.put("creditor", "Nice Pizza Inc.");
        variables.put("assignee", "user1");
        ProcessInstance instance = runtimeService.startProcessInstanceByKey(KeyProcess.KEY_ORDER_PROCESS,processKey, variables);

        return instance.getId();
    }

    public void takeToProcess(String processKey, boolean isFinished){
        Map<String, Object> variables = new HashMap<String,Object>();
        variables.put("creditor", "Nice Pizza Inc.");
        variables.put("assignee", "user1");
        variables.put("isFinished", isFinished);
        taskService.complete(processKey, variables);
    }

}
