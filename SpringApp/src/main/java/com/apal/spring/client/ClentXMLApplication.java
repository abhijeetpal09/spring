package com.apal.spring.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.apal.spring.di.consumer.MyXMLApplication;

public class ClentXMLApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		MyXMLApplication app = context.getBean(MyXMLApplication.class);

		app.processMessage("Hi Pankaj", "pankaj@abc.com");

		// close the context
		context.close();
	}
}
