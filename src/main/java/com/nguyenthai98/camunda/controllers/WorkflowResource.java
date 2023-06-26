package com.nguyenthai98.camunda.controllers;

import com.nguyenthai98.camunda.services.OrderProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/workflow")
public class WorkflowResource {

    @Autowired
    private OrderProcessService orderProcessService;

    @GetMapping("/orderProcess")
    public String orderProcess(){
        return orderProcessService.orderProcessInstance();
    }

    @GetMapping("/takeOrderProcess")
    public String takeOrderProcess(@RequestParam String processKey, @RequestParam boolean isFinished){
        orderProcessService.takeToProcess(processKey, isFinished);
        return "OK";
    }
}
