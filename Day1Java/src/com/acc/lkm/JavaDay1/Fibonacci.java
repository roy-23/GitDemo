package com.acc.lkm.JavaDay1;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int n1=0, n2=1, n3, n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		n = sc.nextInt();
		
		System.out.print(n1 +" "+n2);
		
		for(int i=2;i<n; i++) {
			n3 = n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			
		}
		
		
		
	}
}
