package shapes;

public class Shape2D extends Shape {
	protected double area;
	
	protected Shape2D (String name) {
		super(name);
	}
	
	public double getArea () {
		return this.area;
	}
}
