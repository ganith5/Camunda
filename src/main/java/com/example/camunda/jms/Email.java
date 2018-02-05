package com.example.camunda.jms;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



public class Email {
	
	public Email() {
		
	}
	
	public Email(String to, String body) {
		this.to= to;
		this.body = body;
	}

	
	private String to;
	

	private String body;


	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	@Override
    public String toString() {
        return String.format("Email{to=%s, body=%s}", getTo(), getBody());
    }
	
	

}
