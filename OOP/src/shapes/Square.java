package shapes;

public class Square extends Shape2D {
	private double side;
	
	public Square (double side) {
		super("Square");
		this.side = side;
		setArea();
	}
	
	private void setArea() {
		this.area = this.side * this.side;
	}
	
	/*
	 * GETTERS
	 */
	public double getSide () {
		return this.side;
	}
	
	/*
	 * SETTERS
	 */
	public void setSide (double side) {
		this.side = side;
		setArea();
	}
}
