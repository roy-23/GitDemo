package com.acc.lkm.abstractionDemo;

public abstract class Technology {
	abstract void tech_code(int code);
	void project(String name) {
		System.out.println(name);
	}
	
	public Technology() {
		System.out.println("Innovate!...");
	}
}
