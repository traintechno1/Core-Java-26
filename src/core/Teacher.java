package core;

public class Teacher extends Person {
	
	String subject;
	int age;
	
	Teacher(){
		// something
	}
	
	Teacher(String name, String subject){
		super(name);
		this.subject = subject;
	}
	
	Teacher(String name, int age, String subject){
//		super();
//		this();
		super(name, age);
		this.subject = subject;
	}
	
	public void displayTeacherDetails() {
		System.out.println("-------------Teacher Details------------");
		this.displayPerson();
		System.out.println("Subject: " + this.subject);
//		System.out.println("Age From Teacher Class: " + this.age);
//		System.out.println("Age From Person Class: " + super.age);
		super.printDetails();
	}
	
	public void printDetails() {
		System.out.println("Teacher class");
		
	}
}
