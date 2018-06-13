package com.apal.spring.di.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.apal.spring.di.services.MessageService;
import com.apal.spring.di.services.TwitterService;

@Configuration
@ComponentScan(value = { "com.apal.spring.di.consumer" })
public class TwitterDIConfiguration {

	@Bean
	public MessageService getMessageService() {
		return new TwitterService();
	}
}
