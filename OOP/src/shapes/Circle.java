package shapes;

public class Circle extends Shape2D {
	private double radius;
	private double diameter;
	private double circumference;
	
	public Circle (double radius) {
		super("Cirlce");
		this.radius = radius;
		setArea();
		setDiameter();
		setCircumference();
	}
	
	private void setArea () {
		this.area = this.radius * this.radius * Math.PI;
	}
	
	private void setDiameter () {
		this.diameter = this.radius * 2;
	}
	
	private void setCircumference () {
		this.circumference = 2 * Math.PI * this.radius;
	}
	
	/*
	 * GETTERS
	 */
	public double getRadius () {
		return this.radius;
	}
	
	public double getDiameter () {
		return this.diameter;
	}
	
	public double getCircumference () {
		return this.circumference;
	}

	/*
	 * SETTERS
	 */
	protected void setRadius (double radius) {
		this.radius = radius;
		setArea();
		setDiameter();
		setCircumference();
	}
}
