package com.nelsonripoll.learningjava;

public class Carpet {
	private double cost;
	
	public Carpet (double cost) {
		this.setCost(cost);
	}
	
	/*
	 * GETTERS
	 */
	public double getCost () {
		return this.cost;
	}
	
	/*
	 * SETTERS
	 */
	public void setCost (double cost) {
		if (cost < 0) {
			cost = 0;
		}
		
		this.cost = cost;
	}
}
