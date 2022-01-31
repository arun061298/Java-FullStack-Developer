package com.simplilearn.abstraction;

public class Use {
public static void main(String[] args) {
		
		RangeRover car1= new RangeRover("2019");
		Jaguar car2= new Jaguar("2021");
		
		car1.start();
		car1.powerEngine();
		car1.stop();
		
		car2.start();
		car2.powerEngine();
		car2.powerEngine();
	}

}
