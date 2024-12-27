package core;

import college.Student;

public class AccessModifiersCalls {
	void run() {
		// Public Modifier Test
		
				Student s1 = new Student();
				// Able to access Public Property in different package
				s1.rollNo = 12001;
				
				// getting CT error, because can not access protected member 
				// outside of the package.
//				s1.name = "Jalim";
				
				
				// Able to access Public Method in different package
				s1.printStudentDetails();
	}
}
