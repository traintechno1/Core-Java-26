package core;

public class ObjectCreation {
	
	void run() {
		Human damini = new Human();
		
		damini.hairColor = "Black";
		damini.height = 5.3f;
		damini.weight = 58;
		damini.eyeColor = "Black";
		damini.noFoFingures = 10;
		damini.name = "Damini";
		
		damini.sleep(30);
		System.out.println(damini.name + " has a height of : "+ damini.getHeight() + " ft");
		
		
		Human jalim = new Human();
		
		jalim.name = "Jalim";
		
		jalim.sleep(60);
		
//		Human pallavi;
		// This is an error because while creating pallavi object
		// of Human class I have not allocated memory using new keyword
//		pallavi.name = "Pallavi";
	}
	
}
