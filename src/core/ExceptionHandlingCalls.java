package core;

public class ExceptionHandlingCalls {
	void calls() throws ArithmeticException{
//		int a = 100;
//		System.out.println(a);
//		
//		String s = null;
//		System.out.println(s);
//		s.charAt(0);
//		
//		System.out.println("This is an Advance Java Concept");
		
		
		TryExample te = new TryExample();
//		te.execute();
//		try {			
			te.ownException();
//		}catch(Exception e) {
//			System.out.println(e);
//		}
	}
}
