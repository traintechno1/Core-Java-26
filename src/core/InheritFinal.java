package core;

public class InheritFinal extends FinalExample {
	
	void changeValue(){
		this.value = 300;
	}
	
//  This is invalid as printingValue is a final method in parent class 
//	void printingValue() {
//		System.out.println(this.value + "Value");
//	}
	
}
