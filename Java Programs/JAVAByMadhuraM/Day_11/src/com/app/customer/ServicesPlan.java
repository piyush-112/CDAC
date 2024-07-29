package com.app.customer;

public enum ServicesPlan {
	SILVER(10000), GOLD(3000), PLATINUM(50000), DIAMOND(25000);
	private double cost;

	private ServicesPlan(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return name()+":"+cost;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
}