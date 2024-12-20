package core;

public class Student {
	
	int id;
	String name;
	String standard;
	static String collegeName;
	
	Student(int id, String name, String standard){
		this.id = id;
		this.name = name;
		this.standard = standard;
	}
	
	void getStudentDetails(){
		System.out.println(
				"Id: " + this.id +
				" Name: " + this.name + 
				" Standard: " + this.standard + 
				" collegeName: " + collegeName
				);
	}
		
	static void getCollegeName() {
		System.out.println(
				"College Name: " + collegeName
			);
	}
	
	static {
		collegeName = "Sinhagad COE";
		getCollegeName(); 
//		getStudentDetails(); // not allowed as it is a non static method
	}
	
}
