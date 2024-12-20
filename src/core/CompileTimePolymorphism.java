package core;

public class CompileTimePolymorphism {
	int value;
	String type;
	
	CompileTimePolymorphism() {
	
	}
	
	CompileTimePolymorphism(int value, String type){
		this.value = value;
		this.type = type;
	}
	
	void printDetails(){
		System.out.println("Value : " + this.value );
	}
	
	void printDetails(int value) {
		System.out.println("Value : " + value );
	}
	
	void printDetails(int value, String type) {
		System.out.println("Value : " + value + " Type: " + type );
	}
	
}
