package com.acc.lkm.accessdemo;

import com.acc.lkm.JavaDay1.*;

public class AccessModifiersDemo {
	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = new Car();

		car.start();
		car2.start();
		System.out.println(car.details("black", "v3", "1999"));
		System.out.println(car.details("yellow", "Z1", "2007"));
		car.drive();
		car2.drive();
		car.stop();
		car2.stop();
		
	}
}
