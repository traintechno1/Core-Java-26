package college;

public class Student {
	
	public int rollNo;
	protected String name;
	String lastName;
	
	public void printStudentDetails() {
		// able to access public property rollNo in same class
		// able to access protected property name in same class
		// able to access default property lastName in same class
		System.out.println("Student [ rollNo: " + this.rollNo 
				+ " name: " + this.name + " lastName: " + this.lastName + "]");
	}
	
	public void getDetails() {
		// able to access public method in the same class
		this.printStudentDetails();
	}
	
}
