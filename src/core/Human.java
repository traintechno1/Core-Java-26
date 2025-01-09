package core;

public class Human {

	// Instance Variables
	// Class Variables
	// Data members
    String hairColor;
    float height;
    float weight;
    String eyeColor;
    int noFoFingures;
    String name;
    
    // This is my custom default constructor 
    Human(){
//    	System.out.println("Custom Default Constructor is called");
    	hairColor = "Black";
    	height = 5.0f;
    	weight = 60.00f;
    	eyeColor = "Black";
    	noFoFingures = 10;
    	name = "Ravi";
    }
    
    Human(int noFoFingures){
//    	System.out.println("Custom Custructor with one parameter noOfFingures is called with value : " + noOfFingures);
    	this.noFoFingures = noFoFingures;
    }
    
    Human(String hairColor){
//    	System.out.println("Custom Custructor with one parameter noOfFingures is called with value : " + noOfFingures);
    	this.hairColor = hairColor;
    }
    
    Human(String hairColor,
    		float height, 
    		float weight, 
    		String eyeColor, 
    		int noFoFingures, 
    		String name ){
    	this(9872);
    	this.hairColor = hairColor;
    	this.height = height;
    	this.weight = weight;
    	this.eyeColor = eyeColor;
    	this.noFoFingures = noFoFingures;
    	this.name = name;
    }
    
    // This kind of default constructor will be added by java
//    Human()
//    	hairColor = null;
//    	height = 0.0f;
//    	weight = 0.00f;
//    	eyeColor = null;
//    	noFoFingures = 0;
//    	name = null;
//    }
    
    
    
    Human getDetails(){
    	return this;
    }
    
    
    // member function
    // methods
    // sleep is a method of Human class
   void sleep(int getUpTime) {
	   System.out.println(this.name+ " is sleeping " + name + " will get up in "+ getUpTime + " mins" );
   }
   
// getHeight is a method of Human class
   float getHeight(){
	   return height;
   }
}
