package com.simplylearn.condition;

import java.util.Scanner;

public class demo {
 
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the frist Number");
		int a=scanner.nextInt();
		System.out.println("enter the second Number");
		int b=scanner.nextInt();
		
		if(a>b) 
		{
			System.out.println(a+"is largest");
			
		}
		else {
			System.out.println(b+"is largest");
			
		}
			
	}
}
