package core;

public class TryExample {
		
	void execute() {
		int a = 30;
		int b = 0;
		
		int c = a + b;
		
		System.out.println(c);
		
		try {
			int d = a/b;
			System.out.println(d);
			
			String str = "Tanvi";
			str.charAt(0);
			
			int arr[] = {1, 2, 3};
			arr[2]= 10;
			
		}catch(ArithmeticException ae) {
			System.out.println("Value of b is invalid");
		}
		catch(NullPointerException npe) {
			System.out.println("String str should not be null");
		}
		catch(Exception ex) {
			System.out.println(ex);
		}finally {
			System.out.println("I want to always run");
		}
		
		System.out.println("Table of 30");
		for(int i = 1; i<=10; i++) {
			System.out.println("30 * " + i + " = " + 30*i);
		}
	}
	
	
	void ownException() throws ArithmeticException {
		int age = 1;
		
		if(age> 18) {
			System.out.println("Allowed");
		}
		else {
			throw new ArithmeticException("Age is invalid");			
		}
		

		
//		if(age> 18) {
//			System.out.println("Allowed");
//		}else {
//			System.out.println("Not allowed");
//		}
		
	}
}
