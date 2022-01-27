package com.simplilearn.sync;

public class User extends Thread {

	private String name;
	private String msg;
	private sender sender;
	
	
	public User(String name , String msg, sender sender)
	{
		this.name=name;
		this.msg=msg;
		this.sender=sender;
	}
	public void run()
	{
		synchronized (sender) {
			sender.send(name,msg);
		}
		
	}

}
