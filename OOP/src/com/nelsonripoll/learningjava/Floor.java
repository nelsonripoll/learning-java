package com.nelsonripoll.learningjava;

public class Floor {
	private double width;
	private double length;
	
	public Floor (double width, double length) {
		this.setWidth(width);
		this.setLength(length);
	}
	
	public double getArea () {
		return this.width * this.length;
	}
	
	/*
	 * GETTERS
	 */
	public double getWidth () {
		return this.width;
	}
	
	public double setWidth () {
		return this.width;
	}
	
	/*
	 * SETTERS
	 */
	public void setWidth (double width) {
		if (width < 0) {
			width = 0;
		}
		
		this.width = width;
	}
	
	public void setLength (double length) {
		if (length < 0) {
			length = 0;
		}
		
		this.length = length;
	}
}