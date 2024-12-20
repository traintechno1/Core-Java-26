package core;

public class Person {
	
	String name;
	int age;
	
	Person(){
		
	}
	
	Person(String name){
		this.name = name;
	}
	
	Person(int age){
		this.age = age;
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void displayPerson() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
	}
	
	public void printDetails() {
		System.out.println("Person class");
	}
}
