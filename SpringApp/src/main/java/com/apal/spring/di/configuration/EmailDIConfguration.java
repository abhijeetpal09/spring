package com.apal.spring.di.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.apal.spring.di.services.EmailService;
import com.apal.spring.di.services.MessageService;

@Configuration
@ComponentScan(value = { "com.apal.spring.di.consumer" })
public class EmailDIConfguration {

	@Bean
	public MessageService getMessageService() {
		return new EmailService();
	}
}
