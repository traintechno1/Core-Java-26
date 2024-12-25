package core;

public interface Patient {
	
	int fixedOPDRate = 550;
	
	int getBill(int noOfDays, char wardCategory);
	
	float opdCharges();
}
