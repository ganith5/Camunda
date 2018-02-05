package com.example.camunda.loan;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class CheckStatusDelegate implements JavaDelegate{
	
	final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public CheckStatusDelegate() {
		logger.debug("Created a delegate instance!!!!!!");
	}

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		logger.debug("CheckStatusDelegate - " + execution.getVariable("status"));
		
	}

}
