package core;

public class Constructor {
	void run() {
		
		// here event thought I have not added Human()
		// in Human class still I am able to access this Human()
		// because java has created default constructor automatically
		// which is used to give default values to all of its data members
			Human h = new Human();
			
			System.out.println(
					"HairColor: " + h.hairColor +
					" Height: " + h.height + 
					" Weight: " + h.weight + 
					" EyeColor: " + h.weight + 
					" noOfFingures: " + h.noFoFingures +
					" Name: " + h.name );
		
		// output of above statement is
		// HairColor: null Height: 0.0 Weight: 0.0 EyeColor: 0.0 noOfFingures: 0 Name: null
		// here null, 0.0, 0 these are default values of data, gets assigned by
		// default constructor of the class, which is provided by java as I had not written it
			
			// After running above code I am going to add one default constructor
			// to the class which will have some default values for the data members
			
			Human h1 = new Human(3);
			System.out.println(
				"HairColor: " + h1.hairColor +
				" Height: " + h1.height + 
				" Weight: " + h1.weight + 
				" EyeColor: " + h1.eyeColor + 
				" noOfFingures: " + h1.noFoFingures +
				" Name: " + h1.name );
			
			h1.hairColor = "gray";
	    	h1.height = 5.5f;
	    	h1.weight = 65.00f;
	    	h1.eyeColor = "Black";
	    	h1.noFoFingures = 10;
	    	h1.name = "Kranti";
	    	
	    	System.out.println(
	    			"HairColor: " + h1.hairColor +
	    			" Height: " + h1.height + 
	    			" Weight: " + h1.weight + 
	    			" EyeColor: " + h1.eyeColor + 
	    			" noOfFingures: " + h1.noFoFingures +
	    			" Name: " + h1.name );
			
			Human h2 = new Human(11);
			
			System.out.println("No Of Fingures: " + h2.noFoFingures);
			System.out.println("HairColor: " + h2.hairColor);
			
			Human h3 = new Human("Gray", 5.7f, 65.0f, "Black", 10, "Test");
			
			Human h4 = h3.getDetails();
			
			System.out.println(
					"Getting from H4 " + 
	    			"HairColor: " + h4.hairColor +
	    			" Height: " + h4.height + 
	    			" Weight: " + h4.weight + 
	    			" EyeColor: " + h4.eyeColor + 
	    			" noOfFingures: " + h4.noFoFingures +
	    			" Name: " + h4.name );
			
			System.out.println(
	    			"HairColor: " + h3.hairColor +
	    			" Height: " + h3.height + 
	    			" Weight: " + h3.weight + 
	    			" EyeColor: " + h3.eyeColor + 
	    			" noOfFingures: " + h3.noFoFingures +
	    			" Name: " + h3.name );
			
			Outer o = new Outer();
			o.number = 1000;
			
			Outer.Inner innerObj = o.new Inner(); // To create Inner class object
			
			innerObj.getData();
			
			
	}
}
