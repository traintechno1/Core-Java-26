package college;

public class StringBuilderExample {
	void calls() {
		String s = "";
		s = s.concat("Test");
		
		System.out.println(s);
		
		StringBuilder sb = new StringBuilder("");
		sb.append("Test");
		sb.append(" Message");
		
		System.out.println(sb);
	}
}