package college;

public class WrapperClasses {
	int amount;
	
	byte b = 50;
	short s = 1000;
	int i = 3415;
	float f = 4112.32f;
	double d = 5434.31;
	long l = 68765;
	char c = 'r';
	boolean bool = false;
	
	
	Byte bWrapper;
	Short sWrapper;
	Integer iWrapper;
	Float fWrapper;
	Double dWrapper;
	Long lWrapper;
	Character cWrapper;
	Boolean boolWrapper;
	
	public void autoboxing() {
		// autoboxing
		bWrapper = b; // byte to Byte
		sWrapper = s; // short to Short
		iWrapper = i; // int to Integer
		fWrapper = f; // float to Float
		dWrapper = d; // double to Double
		lWrapper = l; // long to Long
		cWrapper = c; // char to Character
		boolWrapper = bool; // boolean to Boolean
		
		System.out.println("----------------Autoboxing---------------------");
		
		System.out.println("byte to Byte = " + bWrapper);
		System.out.println("short to Short = " + sWrapper);
		System.out.println("int to Integer = " + iWrapper);
		System.out.println("float to Float = " + fWrapper);
		System.out.println("double to Double = " + dWrapper);
		System.out.println("long to Long = " + lWrapper);
		System.out.println("char to Character = " + cWrapper);
		System.out.println("boolean to Boolean = " + boolWrapper);
	}
	
	public void unboxing() {
		// unboxing
		 b = bWrapper; // Byte to byte
		 s = sWrapper; // Short to short 
		 i = iWrapper; // Integer to int 
		 f = fWrapper; // Float to float
		 d = dWrapper; // Double to double
		 l = lWrapper; // Long to long
		 c = cWrapper; // Character to char
		 bool = boolWrapper; //Boolean to boolean
		
		System.out.println("----------------Unboxing---------------------");
		
		System.out.println("Byte to byte = " + b);
		System.out.println("Short to short = " + s);
		System.out.println("Integer to int = " + i);
		System.out.println("Float to float = " + f);
		System.out.println("Double to double = " + d);
		System.out.println("Long to long = " + l);
		System.out.println("Character to char = " + c);
		System.out.println("Boolean to boolean = " + bool);
	}
	
	
	public void test() {
//		not possible as amount is primitive data type and primitives not accept null
//		this.amount = null;
	amount = 5000;
	Integer i = 2000;
	System.out.println(i);
	
//	Want to convert primitive value into respective Object
//	this conversion of primitive to respective wrapper class is called as autoboxing
//	int to Integer
	
//	i = Integer.valueOf(amount); // manually converting int to Integer
//	i = amount; // java is taking care of converting int to Integer
//	System.out.println(i);	

//	this conversion of primitive to respective wrapper class is called as autoboxing
//	Integer to int 
	
//	amount = i.intValue(); // manually converting Integer to int
	amount = i; //java is taking care of converting Integer to int  
	System.out.println(amount);
	}
}
