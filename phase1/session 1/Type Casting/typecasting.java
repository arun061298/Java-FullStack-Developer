package com.simplylearn.live;

public class typecasting {
	public static void main(String[] args) {
		//Impicit conversion
		
		System.out.println("Impicit Type Casting");
		char a='A';
		System.out.println("Value of a"+a);
		
		int b=a;
		System.out.println("value of b"+b);
		
		float c=a;
		System.out.println("value of float"+c);
		
		long d=a;
		System.out.println("value of long"+d);
		
		double e=a;
		System.out.println("value of double"+e);
		
        System.out.println("\n");
		
		System.out.println("Explicit Type Casting");
		//explicit conversion
		
		double x=45.5;
		int y=(int)x;
		System.out.println("Value of x: "+x);
		System.out.println("Value of y: "+y);

		
		
	}

}
