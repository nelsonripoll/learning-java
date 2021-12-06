package com.nelsonripoll.learningjava;

public class Point {
	private int x;
	private int y;
	
	public Point () { }
	
	public Point (int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	
	// d(A, B) = sqrt(xB - xA) * (xB - xA) + (yB - yA) * (yB - yA)
	public double distance () {
		return Math.sqrt((0 - this.x) * (0 - this.x) + (0 - this.y) * (0 - this.y));
	}
	
	public double distance (int x, int y) {
		return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
	}
	
	public double distance (Point p) {
		return Math.sqrt((p.getX() - this.x) * (p.getX() - this.x) + (p.getY() - this.y) * (p.getY() - this.y));
	}
	
	/*
	 * GETTERS
	 */
	public int getX () {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	/*
	 * SETTERS
	 */
	public void setX (int x) {
		this.x = x;
	}
	
	public void setY (int y) {
		this.y = y;
	}
}