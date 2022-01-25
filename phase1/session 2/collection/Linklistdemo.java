package com.simplylearn.collection;

import java.util.LinkedList;

public class Linklistdemo {
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		
		list.add(12);
		list.add(24);
		list.add(36);
		
		System.out.println("size"+list.size());
		list.add(67);
		
		System.out.println(list.get(2));
		
		System.out.println(list);
	}

}
