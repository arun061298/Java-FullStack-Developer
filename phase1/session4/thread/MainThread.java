package com.simplilearn.thread;

public class MainThread extends Thread {
	public static int count=0;
	public MainThread() {
		
	}
	public void run() {
		while(count<=10)
		{
			System.out.println("Thread"+(++count));
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Starting Main Thread...");
		
		MainThread main=new MainThread();
		main.start();
		
		while(count<=10)
		{
			System.out.println("Mian Thread"+(++count));
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
