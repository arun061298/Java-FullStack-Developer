package com.simplylearn.condition;

import java.util.Scanner;

public class Divisibleby5 {
	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);
		System.out.println("Enter the Number");
		int b= ac.nextInt();
		
		if(b % 5 ==0)
		{
			System.out.println(b +" "+"Correct");
			
		}
		else
		{
			System.out.println(b +" "+"Incorrect");
		}
			
	}

}
