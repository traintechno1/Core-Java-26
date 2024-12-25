package core;

public class Encapsulation {
		
	private int bankBalance = 30000;
	
//	int getBankBalance() {
//		return this.bankBalance;
//	}
	
	void setBankBalance(int bankBalance){
		if(bankBalance>20000) {			
			this.bankBalance = bankBalance;
		}
	}
	
	
}	
