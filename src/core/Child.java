package core;

public class Child extends Parent {

	int amount;
	
	Child(){
		
	}
	
	Child(int amount){
		this.amount = amount;
	}
	
	void showAmount(){
		System.out.println("Child amount: " + this.amount);
	}
	
	void details() {
		System.out.println("Child amount: " + this.amount);
	}
}
