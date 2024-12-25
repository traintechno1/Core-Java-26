package core;

public class HospitalA implements Patient {
	
	public int getBill(int noOfDays, char wardCategory) {
		int billAmount = 0;
		if(wardCategory == 'A') {
			billAmount = noOfDays * 12000;
		}else if(wardCategory == 'B'){
			billAmount = noOfDays * 8000;
		}else if(wardCategory == 'C') {
			billAmount = noOfDays * 6000;
		}else {
			billAmount = noOfDays * 4000;
		}
		return billAmount;
	}
	
	public float opdCharges() {
		return (float) (fixedOPDRate * (0.1) + fixedOPDRate); 
	}
}
