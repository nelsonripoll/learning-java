package shapes;

public class Sphere extends Shape3D {
	private double radius;
	
	public Sphere (double radius) {
		super("Sphere");
		this.radius = radius;
		setVolume();
	}
	
	private void setVolume() {
		this.volume = (Math.PI / 3) * (4 * (this.radius * this.radius * this.radius));
	}
	
	/*
	 * GETTERS
	 */
	public double getRadius () {
		return this.radius;
	}
	
	public void setRadius (double radius) {
		this.radius = radius;
		setVolume();
	}
}
