package com.example.camunda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.camunda.services.LoanProcessingService;

@RestController
public class LoanProcessingController {
	
	@Autowired
	private LoanProcessingService loanProcessingService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/process")
	public void processLoan() {
		loanProcessingService.process();
	}

}
