package com.acc.lkm.InheritanceDemo;

public interface ProjectLead {
	default void id(int empid) {
		System.out.println(empid);
	}

	static String org(String name) {
		return name;
	}

	void prject(int project_id);
}
