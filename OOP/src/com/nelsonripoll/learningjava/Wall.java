package com.nelsonripoll.learningjava;

public class Wall {
	private double width;
	private double height;
	
	public Wall () {};
	
	public Wall (double width, double height) {
		this.setWidth(width);
		this.setHeight(height);
	}
	
	public double getArea () {
		return this.width * this.height;
	}
	
	/*
	 * GETTERS
	 */
	public double getWidth () {
		return this.width;
	}
	
	public double getHeight () {
		return this.height;
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
	
	public void setHeight (double height) {
		if (height < 0) {
			height = 0;
		}
		
		this.height = height;
	}
}