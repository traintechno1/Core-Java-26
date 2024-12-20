package core;

public class LoopingStatements {
	void run() {
		for(int i = 16; i<15; i++) {			
			System.out.println("Dipika" + (i+1));
		}
		
		// Table of 10
		System.out.println("**********************************************");
		
		for(int i = 1; i <=10; i++) {
			System.out.println("23 * " + i + " = "+ 23 * i);
		}
		
		int i = 16;
        while(i<=15){
           System.out.println("Dipika" + i);
           i++;  
        }
		
//		int i = 16;
		
		do {
			System.out.println("Dipika" + i);
			i++;
		}while(i<=15);
        
        
	}
}
