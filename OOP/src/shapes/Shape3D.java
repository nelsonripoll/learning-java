package shapes;

public class Shape3D extends Shape {
	protected double volume;
	
	protected Shape3D (String name) {
		super(name);
	}
	
	public double getVolume () {
		return this.volume;
	}
}
