package com.simplylearn.collection;

import java.util.HashSet;

public class HashsetDemo {
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		
		set.add("arun");
		set.add("dk");
		set.add("raja");
		set.add("rudra");
		set.add("duggu");
		//no oder maintain
		System.out.println(set);
		//no duplicated allowed
		set.add("kusum");
		
		System.out.println(set);
		
		System.out.println("Is Empty"+set.isEmpty());
		set.remove("kusum");
		
		System.out.println("size"+set.size());
		set.add(null);
		System.out.println(set);
		
	}

}
