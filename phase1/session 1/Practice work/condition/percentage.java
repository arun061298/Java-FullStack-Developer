package com.simplylearn.condition;

import java.util.Scanner;

public class percentage {
	public static void main(String[] args) {
		Scanner per= new Scanner(System.in);
		System.out.println("Enter the Percentage");
		int a= per.nextInt();
		
	if(a>=70)
	{
		System.out.println(a +"Distintion");
	}
	else if(a>60 && a<70)
	{
		System.out.println(a +"second Division");
	}
	else if(a>50 && a<60)
	{
		System.out.println(a +"Third Division");
		
	}
	else
	{
		System.out.println(a +"Fail");
	}
		
	
	}
}
