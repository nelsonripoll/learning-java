package com.nelsonripoll.learningjava;

public class Main {
	public static void main(String[] args) {
		// CarExample();
		// SimpleCalculatorExample();
		// PersonExample();
		// BankAccountExample();
		// FloorCarpetCalculatorExample();
		ComplexNumberExample();
	}
	
	public static void CarExample () {
		Car porsche = new Car();
		
		porsche.setDoors(2);
		porsche.setModel("Carrera");
		porsche.setColor("Red");
		porsche.setEngine("V6");
		porsche.setWheels(4);
		
		System.out.println(porsche.getModel());
		System.out.println(porsche.getColor());
	}
	
	public static void SimpleCalculatorExample () {
		SimpleCalculator calculator = new SimpleCalculator();
		
		calculator.setFirstNumber(5.0);
		calculator.setSecondNumber(4);
		
		System.out.println("add = " + calculator.getAdditionResult());
		System.out.println("subtract = " + calculator.getSubtractionResult());
		System.out.println("multiply = " + calculator.getMultiplicationResult());
		System.out.println("divide = " + calculator.getDivisionResult());
	}
	
	public static void PersonExample () {
		Person person = new Person();
		
		person.setFirstName("");
		person.setLastName("");
		person.setAge(10);
		
		System.out.println("fullname = " + person.getFullName());
		System.out.println("is teen = " + person.isTeen());
		
		person.setFirstName("John");
		person.setAge(18);
		
		System.out.println("fullname = " + person.getFullName());
		System.out.println("is teen = " + person.isTeen());
		
		person.setLastName("Smith");
		System.out.println("fullname = " + person.getFullName());
	}

	public static void BankAccountExample () {
		BankAccount account = new BankAccount("12345", 20.35, "Bob", "Smith", 46, "bsmith@email.com", "3124445555");
		
		System.out.println("Account: " + account.getAccount());
		System.out.println("Balance: " + account.getBalance());
		System.out.println("Owner: " + account.getOwner().getFullName());
		
		account.deposit(40.22);
		
		Person owner = new Person();
		owner.setFirstName("John");
		owner.setLastName("Doe");
		
		account = new BankAccount("67890", 99.30, owner);
		
		System.out.println("Account: " + account.getAccount());
		System.out.println("Balance: " + account.getBalance());
		System.out.println("Owner: " + account.getOwner().getFullName());
		
		account.withdraw(33.33);
	}
	
	public static void FloorCarpetCalculatorExample () {
		Carpet carpet = new Carpet(3.5);
		Floor floor = new Floor(2.75, 4.0);
		FloorCarpetCalculator calculator = new FloorCarpetCalculator(floor, carpet);
		System.out.println("total= " + calculator.getTotalCost());
		carpet = new Carpet(1.5);
		floor = new Floor(5.4, 4.5);
		calculator = new FloorCarpetCalculator(floor, carpet);
		System.out.println("total= " + calculator.getTotalCost());
	}
	
	public static void ComplexNumberExample () {
		ComplexNumber one = new ComplexNumber(1.0, 1.0);
		ComplexNumber number = new ComplexNumber(2.5, -1.5);
		one.add(1,1);
		System.out.println("one.real= " + one.getReal());
		System.out.println("one.imaginary= " + one.getImaginary());
		one.subtract(number);
		System.out.println("one.real= " + one.getReal());
		System.out.println("one.imaginary= " + one.getImaginary());
		number.subtract(one);
		System.out.println("number.real= " + number.getReal());
		System.out.println("number.imaginary= " + number.getImaginary());
	}
}