package core;

public class LogicalOperators {
	void run() {
		int a = 600;
		int b = 500;
		
		boolean result;
		
		System.out.println("------------- AND Operator -------------");
		// AND Operator
		result = a > 300 && b < 600; // true && true
		System.out.println(result); // true
		
		result = a > 300 && b > 600; // true && false
		System.out.println(result); // false
		
		result = a < 300 && b > 300; // false && true
		System.out.println(result); // false
		
		result = a < 300 && b < 300; // false && false
		System.out.println(result); // false
		
		
		System.out.println("------------- OR Operator -------------"); 
		
		// OR Operators
		
		result = a > 300 || b < 600; // true || true
		System.out.println(result); // true
		
		result = a > 300 || b > 600; // true || false
		System.out.println(result); // true
		
		result = a < 300 || b > 300; // false || true
		System.out.println(result); // true
		
		result = a < 300 || b < 300; // false || false
		System.out.println(result); // false
		
		
		System.out.println("------------- NOT Operator -------------");
		
		result = true;
		result = !result;
		System.out.println(result); // false
		
		result = !result;
		
		System.out.println(result); // true
	}
}
