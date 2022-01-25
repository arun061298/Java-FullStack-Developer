package com.simplylearn.loop;

import java.util.Scanner;

public class natural50 {
	public static void main(String[] args) {
		int num,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number= sc.nextInt();
		
		for(i=1;i<=number;i++)
		{
			System.out.println(i+"\t");
		}
		
	}

}
