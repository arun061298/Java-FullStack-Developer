package com.simplylearn.condition;

import java.util.Scanner;

public class evenorodd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");
		int a= sc .nextInt();
		
		if(a % 2 == 0)
		{
			System.out.println(a +"is even");
		
		}
		else
		{
			System.out.println(a +"is odd");
		}
	}

}

