package mainCustomer;

public enum ServicePlan {
	SILVER(10000),GOLD(20000),PLATINUM(30000),DIAMOND(40000);
	private double cost;
	ServicePlan(double cost) {
		this.cost=cost;
	}
	@Override
	public String toString() {
		return name()+":"+cost;
	}
	public double getcost() {
		return cost;
	}
}
