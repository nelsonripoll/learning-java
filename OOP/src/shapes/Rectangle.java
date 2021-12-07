package shapes;

public class Rectangle extends Shape2D {
	private double length;
	private double width;
	
	public Rectangle (double length, double width) {
		super("Rectangle");
		this.length = length;
		this.width = width;
		setArea();
	}
	
	protected void setArea() {
		this.area = this.length * this.width;
	}
	
	public double getLength () {
		return this.length;
	}
	
	public double getWidth () {
		return this.width;
	}
	
	public void setLength (double length) {
		this.length = length;
		setArea();
	}
	
	public void setWidth (double width) {
		this.width = width;
		setArea();
	}
}
