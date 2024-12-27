package college;

public class Batch {
	
	void getStudents() {
		// Student class belongs to same package 
		// hence I have not imported it
		Student s1 = new Student();
		// able to access public property rollNo in same package
		s1.rollNo = 1234;
		// able to access protected property name in same package
		s1.name = "Jalim";
		// able to access default property lastName in same package
		s1.lastName = "Chakma";

//		 not able to access private property within in same package
//		s1.email = "damini@gmail.com";
		
		// able to access public method in same package
		s1.printStudentDetails();
		
		
		
	}
}
