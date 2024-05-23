package com.acc.lkm.JavaDay1;

public class ArrayCopyOf {
	public static void main(String[] args) {
		changeArraySize();
	}
	private static void changeArraySize() {
		int [] arraysize = new int[5];
		System.out.println("Before changing sie : "+ arraysize.length);
		
		//Increasing the size ny 2 times
		arraysize = java.util.Arrays.copyOf(arraysize,  arraysize.length*2);
		System.out.println("After changing size : "+arraysize.length);
	}
}
