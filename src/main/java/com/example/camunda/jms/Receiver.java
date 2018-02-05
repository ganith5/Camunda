package com.example.camunda.jms;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
	

	@Autowired
	private RuntimeService runtimeService;

	 	@JmsListener(destination = "mailbox", containerFactory = "myFactory")
	    public void receiveMessage(Email email) {
	        System.out.println("Received <" + email + ">");
	        this.runtimeService.correlateMessage("processingLoan", "approve-loan-business-key");
	    }

}