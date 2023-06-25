package com.nguyenthai98.camunda.services;


import org.camunda.bpm.engine.HistoryService;
import org.camunda.bpm.engine.ManagementService;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CamundaProcessService {
    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    private ManagementService managementService;

    @Autowired
    private TaskService taskService;

    @Autowired
    private HistoryService historyService;





}
