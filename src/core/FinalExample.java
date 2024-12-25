package core;

public class FinalExample {
	
	int value = 100;
	final float PI = 3.14f;
	
	void changeValue(){
		this.value = 200;
	}
	
	final void printingValue() {
		System.out.println(this.value);
	}
	
}
