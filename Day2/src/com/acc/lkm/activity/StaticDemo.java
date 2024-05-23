//you will create a utility class for an e-commerce application. This utility class will handle some 
//common tasks such as generating order IDs, managing a list of all orders, and providing some static 
//configuration settings.
//Understand and use static variables.
//Implement and call static methods.
//Use static blocks for initialization.
//Define and use a static nested class.

package com.acc.lkm.activity;

public class StaticDemo {
	
	private static int orderId;
	private String orderName;
	
	public static int generateOrderId() {
		
	}
	
	public static void main(String[] args) {
		StaticDemo s = new StaticDemo();
		s.generateOrderId(25);
	}
}
