package core;

public class Student1 extends Person{
	
	char grade;
	
	Student1(String name, int age, char grade){
		super(name, age);
		this.grade = grade;
	}
	
	public void displayStudent() {
		System.out.println("-------------Student Details------------");
		this.displayPerson();
		System.out.println("Grade: " + this.grade);
	}
}
