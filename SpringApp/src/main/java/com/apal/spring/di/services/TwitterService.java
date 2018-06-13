package com.apal.spring.di.services;

public class TwitterService implements MessageService{

	public boolean sendMessage(String msg, String uname) {
		// TODO Auto-generated method stub
		System.out.println("Sent Twitter direct message: " + msg +" to " + uname);
		return true;
	}
}
