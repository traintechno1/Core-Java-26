package core;

public class ComparisonOperators {
	void run() {
		int a = 600;
		int b = 500;
		
		boolean equality = a == b;
		boolean inEquality = a != b;
		boolean greaterThan = a > b;
		boolean lessThan = a < b;
		boolean lessThanEqual = a <= b;
		boolean greaterThanEqual = a >= b;
		
		System.out.println("Equality = " + equality);
		System.out.println("InEquality = " + inEquality);
		System.out.println("GreaterThan = " + greaterThan);
		System.out.println("LessThan = " + lessThan);
		System.out.println("LessThanEqual = " + lessThanEqual);
		System.out.println("GreaterThanEqual = " + greaterThanEqual);
	}
}
