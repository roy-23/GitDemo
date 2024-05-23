package com.acc.lkm.JavaDay2;

public class StringFunc {
	public static void main(String[] args) {
		String str = new String("Ashwathama is a good boy. Ashwathama");
		String s = "good";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.indexOf('w'));
		System.out.println(str.lastIndexOf('a'));
		System.out.println(str.lastIndexOf(s));
		
		
	}
}
