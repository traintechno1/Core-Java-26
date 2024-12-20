package core;

public class ConditionalStatements {
	void run() {
		
		// if, if-else
		int age = 19;
		int amount = 8000;
		
		System.out.println(
				(age > 18 && amount > 10000) ? "Allowed in Restaurant: Yes" :
			"Allowed in Restaurant: No");
		
		if(age > 18 && amount > 10000) {
			System.out.println("Allowed in Restaurant: Yes");
		}
		else {
			System.out.println("Allowed in Restaurant: No");
		}
		
		// else-if ladder
		int marksInPercentage = 17;
		String passingClass = "";
		
		
		if(marksInPercentage > 60) {
			passingClass = "Distinction";
		}
		else if(marksInPercentage > 50 && marksInPercentage <= 60) {
			passingClass = "First Class";
		}
		else if(marksInPercentage > 40 && marksInPercentage <= 50) {
			passingClass = "Second";
		}
		else if(marksInPercentage > 35 && marksInPercentage <= 40) {
			passingClass = "Third Class";
		}
		else {
			passingClass = "Failed";
		}
		
		System.out.println(passingClass);
		
		
		// Nested If-else
		
		int pAge = 21;
		char gender = 'Q';
		
		
		if(gender == 'M') {
			if(pAge > 21) {
				System.out.println("Allowed for marriage");	
			}else {
				System.out.println("Not-allowed for marriage");	
			}
		}else if(gender == 'F') {
			if(pAge> 18) {
				System.out.println("Allowed for marriage");	
			}
			else {
				System.out.println("Not-allowed for marriage");	
			}
		}else {
			System.out.println("Invalid Gender");
		}
	}
}
