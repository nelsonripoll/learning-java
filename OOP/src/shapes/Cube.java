package shapes;

public class Cube extends Shape3D {
	private double side;
	
	public Cube (Square square) {
		this(square.getSide());
	}
	
	public Cube (double side) {
		super("Cube");
		this.side = side;
		setVolume();
	}
	
	private void setVolume() {
		this.volume = this.side * this.side * this.side;
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
	public void setSide(double side) {
		this.side = side;
		setVolume();
	}
}
