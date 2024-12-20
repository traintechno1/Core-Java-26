package core;

public class AssignmentOperators {
	void run() {
		int a = 600;
		
		a += 60; // ==> a = a + 60  
		System.out.println(a); //  660
		
		a -= 30; // ==> a = a - 30;  
		System.out.println(a); //  630
		
		a *= 20;
		System.out.println(a); //  12600
		
		a /= 10;
		System.out.println(a); //  1260
		
		a %= 10;
		System.out.println(a); // 0
		
		char c = 'a';
		char d = 'e'; // Here d is a variable name and 'e' is a value that we are storing in d
		
		System.out.println("Value of c before change : " + c); // a
		
		c = d;
		
		System.out.println("Value of c after change : " + c); // e
		System.out.println("Value of d : " + d); // e
		
		d = '@';
		
		System.out.println("Value of d after assignment : " + d); // e
		
		System.out.println("Value of a : " + a); // 0
	}
}
