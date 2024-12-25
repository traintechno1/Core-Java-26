package core;

public interface Area {
	
//	In Java Interface all the methods are abstract methods,
//	no method can have body/implementation
	
	
//	 This is invalid method in interface
//	void calculateArea() {
//		System.out.println("");
//	}
	
	// abstract keyword is optional as Java will add it in
	// interface method by default
	abstract float getArea(int radius);
	
	// we have avoided using abstract keyword but still the method is abstract
	void printArea();
	
}
