package com.nelsonripoll.learningjava;

import com.nelsonripoll.learningjava.Animal;

public class Dog extends Animal {
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;
	
	public Dog (String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
		super(name, 1, 1, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}
	
	public void chew() {
		System.out.println("Dog.chew()");
	}
	
	@Override
	public void eat() {
		System.out.println("Dog.eat()");
		this.chew();
		super.eat();
	}
	
	public void walk() {
		System.out.println("Dog.walk()");
		super.move(10);
	}
	
	public void run() {
		System.out.println("Dog.run()");
		move(10); // runs override method this.move()
	}
	
	@Override
	public void move (int speed) {
		System.out.println("Dog.move() Speed = " + speed);
	}
}