package core;

public class Parent {
	
	int amount;
	
	Parent(){
		
	}
	
	Parent(int amount){
		this.amount = amount;
	}
	
	void showAmount(){
		System.out.println("Parent amount: " + this.amount);
	}
	
	void getDetails() {
		System.out.println("Parent amount: " + this.amount);
	}

}
