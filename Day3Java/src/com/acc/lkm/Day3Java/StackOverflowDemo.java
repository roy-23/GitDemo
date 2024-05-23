package com.acc.lkm.Day3Java;

public class StackOverflowDemo {
	
	public static void main(String[] args) {
		call();
	}
	
	public static void call() {
		main(null);
		System.out.println("ok");
	}
}
