package com.example.camunda.loan;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.spring.boot.starter.event.PostDeployEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@Configuration
public class LoanApplicationService {
	
	@Autowired
	public RuntimeService runtimeService;
	
	@EventListener
	public void processPostDeploy(PostDeployEvent postDeployEvent) {
		System.out.println("Post deploy event");
		runtimeService.startProcessInstanceByKey("approve-loan", "approve-loan-business-key");
		
	}

}
