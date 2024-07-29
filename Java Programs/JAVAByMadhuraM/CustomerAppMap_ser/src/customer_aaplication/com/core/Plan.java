package customer_aaplication.com.core;

public enum Plan {
/*SILVER : 1000 
GOLD : 2000
DIAMOND : 5000
PLATINUM : 10000*/
	SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);

	double amount;
	
	private Plan(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	
		
		
}
