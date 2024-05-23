package com.acc.lkm.Day3Java;
import java.io.IOException;
import java.sql.SQLException;

import javax.xml.bind.ValidationEvent;

public class TestOverriding extends EmpDetails{

	public static void main(String[] args)  throws IOException, SQLException{
		try {
			validation(9);
		}
		catch(Exception e) {
			System.out.println("Exception thrown in parent");
		}

	}
	void get(int proj_id) {
		System.out.println(proj_id);
	}

}
