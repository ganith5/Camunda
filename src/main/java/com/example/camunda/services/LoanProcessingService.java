package com.example.camunda.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.example.camunda.jms.Email;

@Component
public class LoanProcessingService {
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	public void process() {
		System.out.println("Processing loan");
		System.out.println("Sending an email message.");
		this.jmsTemplate.convertAndSend("mailbox", new Email("ps@comp.com", "Hello"));
	}

}
