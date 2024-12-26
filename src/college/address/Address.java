package college.address;

public class Address {
	
	int pinCode;
	String state;
	String country;
	
	public Address(int pinCode, String state, String country) {
		this.pinCode = pinCode;
		this.state = state;
		this.country = country;
	}
	
	public void getAddress() {
		System.out.println(
				"Address [pinCode=" + pinCode + ", state=" + state + ", country=" + country + "]");
	}
	
}
