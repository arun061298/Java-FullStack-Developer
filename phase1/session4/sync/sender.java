package com.simplilearn.sync;

public class sender {

	
	public void send(String name, String msg)
	{
		System.out.println(name+"Sending"+msg);
		try {
			Thread.sleep(1000);
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("message sent sucessfully");
	}
}
