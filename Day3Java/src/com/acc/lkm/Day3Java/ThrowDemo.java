package com.acc.lkm.Day3Java;

import java.io.IOException;

public class ThrowDemo {
	public static void main(String[] args) {
		try {
			readFile();
		}
//		catch(IOException e) {
//			System.out.println(e.getMessage());
//		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void readFile()  {
//		throw new IOException("File not found");
		throw new NullPointerException("File not found");
		
	}
}
