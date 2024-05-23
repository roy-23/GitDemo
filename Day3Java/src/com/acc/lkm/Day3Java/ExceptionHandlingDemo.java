package com.acc.lkm.Day3Java;

import java.util.Arrays;

public class ExceptionHandlingDemo {
	public static void main(String[] args) {
		
		try {
			//arrayIndexOutOfBound
			int[] arr = {1,3,5,7,9};
			arr[1]=23;
			System.out.println(Arrays.toString(arr));
			
			//numberFormat
			String str = "Java";
			Integer a = Integer.valueOf(str);
			System.out.println(a);
			
			//NullPointer
			String str2  = null;
			System.out.println(str.length());
			
			
			Integer x = 100;
			Integer y = x/0;
			System.out.println(y);
			Integer num = 100;
		}
		
		catch(ArithmeticException ex) {
			System.out.println("AE");
		}
		catch(NullPointerException ex) {
			System.out.println("NPE");
		}
		catch(NumberFormatException ex) {
			System.out.println("NFE");
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("AIOOB");
		}
		catch(Exception ex) {
			System.out.println("There is some exception");
		}
		finally {
	
			System.out.println("Hehehehehehe");
		}
		
		
	}
}
