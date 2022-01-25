package com.simplylearn.condition;

import java.util.Scanner;

public class voter {
	public static void main(String[] args) {
		Scanner rc=new Scanner(System.in);
		System.out.println("Ener the Age");
		int a= rc.nextInt();
		
		if(a>=18)
		{
			System.out.println(a+"You are eligible for voting");
			
		}
		else
		{
			System.out.println(a +" "+"You are not eligible for voter");
		}
	}

}
