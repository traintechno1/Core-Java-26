package core;

public class Outer {
	int number;
	
	class Inner{
		void getData() {
			System.out.println("From Inner Class: " + Outer.this.number);
		}
	}
}
