package com.acc.lkm.JavaDay2;

public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder stringB =  new StringBuilder("Java is a object oriented");
////		stringB.insert(17, " Java");
//		stringB.replace(0, 9, "String Builder ");
//		stringB.delete(20, 23);
//		stringB.append(" Java StringBuilder is in progress");
		System.out.println(stringB);
		System.out.println(stringB.capacity());
		
		stringB.append("Java StringBuilder is in pprogress and other concepts");
		System.out.println(stringB);
		System.out.println(stringB.capacity());
		
		stringB.ensureCapacity(50);
		System.out.println(stringB);
		System.out.println(stringB.capacity());
	}
}
