package com.nelsonripoll.learningjava;

public class FloorCarpetCalculator {
	private Floor floor;
	private Carpet carpet;
	
	public FloorCarpetCalculator (Floor floor, Carpet carpet) {
		this.floor = floor;
		this.carpet = carpet;
	}
	
	public double getTotalCost () {
		return this.floor.getArea() * this.carpet.getCost();
	}
}