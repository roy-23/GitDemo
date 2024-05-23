package com.acc.lkm.Day3Java;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class NestedTry {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String empname = "Roy";
		
		System.out.println("jhabvsjdhba");
		
		try {
			try {
				String str = "Java";
				Integer a = Integer.valueOf(str);
				System.out.println(a);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			try {
				if(empname != null) {
					throw new IOException("Emoloyee is present");
				}
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		catch(Exception e){
			System.out.println("Hehehehehe");
		}
	}
}
