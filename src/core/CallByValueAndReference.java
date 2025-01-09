package core;

public class CallByValueAndReference {
	
	void byValue() {
		int value = 200;
		this.changeValue(value);
		System.out.println(value); // 
	}
	
	void changeValue(int value) {
		value = 500;
	}
	
	void byReference() {
		Human h = new Human();
		h.name = "Tanvi";
		h.height = 5.5f;
		changeName(h);
		System.out.println(h.height);
	}
	
	void changeName(Human human) {
		human.name = "Rajashree";
		human.height = 5.6f;
	}
}
