package core;

public class SwitchCase {
	void run() {
		int val = 25;
		
		switch(val) {
			case 5 :
				System.out.println("Value is 5");
			break;
			
			case 10 : 
				System.out.println("Value is 10");
			break;
			
			case 15:
				System.out.println("Value is 15");
			break;
			
			case 20: 
				System.out.println("Value is 20");
			break;
			
			default:
				System.out.println("None of the cases matched");
			break;
		}
	}
}
