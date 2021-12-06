package com.nelsonripoll.learningjava;

public class Rectangle {
	private int x;
	private int y;
	private int width;
	private int height;
	
	/* BAD CONSTRUCTORS
	public Rectangle () {
		this.x = 0;
		this.y = 0;
		this.width = 0;
		this.height = 0;
	}
	
	public Rectangle (int width, int height) {
		this.x = 0;
		this.y = 0;
		this.width = width;
		this.height = height;
	}
	*/
	
	public Rectangle () {
		this(0,0); // call 2nd constructor
	}
	
	public Rectangle (int width, int height) {
		this(0,0,width,height); // call 3rd constructor
	}
	
	public Rectangle (int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
}
