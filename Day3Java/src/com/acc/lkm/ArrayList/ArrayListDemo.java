package com.acc.lkm.ArrayList;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		//Non generic
		
		ArrayList <String> aL = new ArrayList<String>();
		System.out.println("Technology Sector");
		aL.add("Java");
		aL.add("Python");
		aL.add("C++");
		aL.add("C");
		
//		Iterator it = aL.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		aL.add(3,"Hybris");
		System.out.println(aL);
		
		ArrayList <String> aL2 = new ArrayList<>();
		
		aL2.add("Europe");
		aL2.add("Japan");
		aL2.add("India");
		
		aL.addAll(aL2);
		
		System.out.println(aL);
		
		aL.remove(7);
		
		System.out.println(aL);
		
		aL.removeIf(str->str.contains("C++"));
		System.out.println(aL);
		
		aL.removeAll(aL2);
		System.out.println(aL);
		System.out.println(aL2);
		
	}

}
