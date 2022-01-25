package com.simplilearn.inner;

public class LocalInnerClass {

	void validate(int age)
	{
		if(age>=18)
		{
			class Inner{
				void test()
				{
					System.out.println("Now Authenticate User Using Adhar");
					
				}
				
			}
			Inner inner= new Inner();
			inner.test();
		}
		else
		{
			System.out.println("no need to Authenticate");
		}
		
	}
	public static void main(String[] args) {
		LocalInnerClass local=new LocalInnerClass();
		local.validate(8);
		
	}
	
}
