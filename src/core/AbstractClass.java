package core;

public abstract class AbstractClass {
	int value1;
	
	AbstractClass(){
		
	}
	
	abstract void details();
	
	void showDetails()
	{
		System.out.println("showDetails method called");
	}
}
