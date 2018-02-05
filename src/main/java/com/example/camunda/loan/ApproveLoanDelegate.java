package com.example.camunda.loan;


import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


public class ApproveLoanDelegate implements JavaDelegate{
	
	final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	RuntimeService runtimeService;
	public ApproveLoanDelegate() {
		logger.debug("Created a delegate instance!!!!!!");
	}

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		logger.info("Inside ApproveLoanDelegate = " + execution.getCurrentActivityId());
		execution.setVariable("status", "approved");
		logger.info("Variable map = " + execution.getVariables());
		
		
		runtimeService.createMessageCorrelation("processingLoan")
		.processInstanceBusinessKey("approve-loan-business-key").correlateAll();
	
	}
	
	
	
	

}
