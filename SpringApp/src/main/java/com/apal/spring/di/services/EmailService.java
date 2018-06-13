package com.apal.spring.di.services;


public class EmailService implements MessageService {

	public boolean sendMessage(String msg, String rec) {
		// TODO Auto-generated method stub
		System.out.println("Sent email: " + msg + ", to " + rec);
		return true;
	}

	
}
