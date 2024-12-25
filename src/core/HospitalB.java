package core;

public class HospitalB implements Patient {
	
	public int getBill(int noOfDays, char wardCategory) {
		int billAmount = noOfDays * 5000;
		return billAmount;
	}
	
	public float opdCharges() {
		return (float) (fixedOPDRate * (0.2) + fixedOPDRate); 
	}
	
}
