package core;

public class StringComparison {
	void calls() {
		String str1 = "Jalim";
		String str2 = "Jalim";
		String str3 = new String("Jalim");
		String str4 = new String("Jalim");
		
		System.out.println(str1.compareTo(str2)); //0
		System.out.println(str2.compareTo(str3)); //0
		System.out.println(str3.compareTo(str4)); //0
		
		System.out.println(str1.equals(str2)); //true
		System.out.println(str2.equals(str3)); //true
		System.out.println(str3.equals(str4)); //true
		
		System.out.println(str1 == str2); //true
		System.out.println(str2 == str3); // false
		System.out.println(str3 == str4); // false
	}
}
