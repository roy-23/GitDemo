package com.acc.lkm.JavaDay1;

import java.sql.Date;

public class Car {
	
	private String color;
	private String model;
	private String year;
	
	public void start() {
		System.out.println("Car has started");
	}
	public void stop() {
		System.out.println("Car has stopped");
	}
	public void drive() {
		System.out.println("Driver is driving");
	}
	
	public String details(String color, String model, String year ) {
		this.color = color;
		this.model=model;
		this.year = year;
		return this.color+"\t"+this.model+"\t"+this.year;
	}
	
	public static void main(String[] args) {
		Car cars = new Car();
		
		cars.start();
		
		System.out.println(cars.details("blue", "V1", "1990"));
	}
	
	

}
