package com.acc.lkm.InheritanceDemo;

public class Participant extends Organization{
	
	Participant(){
//		super(500);
		System.out.println("Learning Java Inheritance");
		System.out.println(super.facility);
	}
	void learning(String stream1, String stream2){
		System.out.println(stream1+" " +stream2);
//		super.details("Accenture", "Mumbai");
	}
	void session() {
		System.out.println("Inheritance");
	}

	public static void main(String[] args) {
		Organization o =new Organization();
		Participant p = new Participant();
		Trainer t = new Trainer();
		Trainer t2 = new Trainer();
		p.learning("Java", "Python");
		t.details("Roy", 13);
		t.details("Accenture", 33);
//		p.training("Java SE");
//		p.org(100);
	}
	
}
