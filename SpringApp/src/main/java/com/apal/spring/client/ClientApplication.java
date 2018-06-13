package com.apal.spring.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.apal.spring.di.configuration.EmailDIConfguration;
import com.apal.spring.di.consumer.MyApplication;

public class ClientApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(EmailDIConfguration.class);
		MyApplication myApp = context.getBean(MyApplication.class);
		
		myApp.processMessage("Hi Robert", "robert01@abc.com");
		context.close();
	}
}
