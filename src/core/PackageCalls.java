package core;

import college.CollegeDetails;
import college.Student;
import college.address.Address;

public class PackageCalls {
	void run() {
		// required to import it as it is part of different package
		CollegeDetails cd = new CollegeDetails("COEP", 1200, "Pune");
		cd.getCollegeDetails();
		
		// not required to import it as it belongs to same package
		Array a = new Array();
		a.run();
		
		Student s1= new Student();
		
		System.err.println(s1);
		
		Address add = new Address(411001, "MH", "IN");
		add.getAddress();
	}
}
