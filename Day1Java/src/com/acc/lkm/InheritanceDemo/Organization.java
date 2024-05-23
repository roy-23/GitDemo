package com.acc.lkm.InheritanceDemo;

public class Organization {
	
	String facility="KDC";
	
	public Organization() {
		System.out.println("Accenture");
	}
//	Organization(int id){
//		System.out.println(id);
//	}
	
	protected void get() {
		
	}
	
	private void org(int id) {
		System.out.println(id);
	}
	
	protected void details(String name, int location_id) {
		System.out.println("Parent");
		System.out.println(name+" "+location_id);
	}
}
