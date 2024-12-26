package college;

public class Teacher extends Student{
	
	void printTeacher() {
		// Able to access public property rollNo of Student class using subclass
		System.out.println(this.rollNo);
		
		// Able to access protected property name of Student class using subclass
		System.out.println(this.name);
		
		// Able to access default property lastName of Student class using subclass in same package
		System.out.println(this.lastName);
	}
	
}
