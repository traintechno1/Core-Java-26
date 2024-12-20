package core;

public class StaticCalls {
	void run() {
		Student.collegeName = "MIT";
		
		Student s1 = new Student(101, "Jalim", "3rd Year");
		s1.getStudentDetails();
		
		Student s2 = new Student(102, "Damini", "4rd Year");
		s2.getStudentDetails();
		
		Student s3 = new Student(103, "Rajashree", "4rd Year");
		s3.getStudentDetails();
		
		Student s4 = new Student(104, "Bhagyashree", "3rd Year");
		s4.getStudentDetails();
	}
}
