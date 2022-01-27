package com.simplilearn.sync;

public class Test {
public static void main(String[] args) {
		
		sender sender=new sender(); // object want to share between multiple threads
		
		User user1=new User("Arun", "Hiiiii........", sender);
		User user2=new User("Anurag", "Bye...." , sender);
		
		user1.start();
		user2.start();
	}

}
