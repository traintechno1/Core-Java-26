package core;

import college.Student;

public class Subject extends Student {
	void printSubject() {
		// Accessing protected property outside of the package using subclass
		this.name = "Jalim";
		
		Student s1 = new Student();
		// can not access protected property ouside of the package with object
//		 get a CT error
//		s1.name = "Rajashree";
		
		// can not access default property ouside of the package with object
//		s1.lastName = "Chakma";
		
		// can not access default property ouside of the package with subclass
//		this.lastName = "Chakma";
	}
}
