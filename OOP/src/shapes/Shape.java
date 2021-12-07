package shapes;

public class Shape {
	private String name;
	
	protected Shape (String name) {
		this.name = name;
	}
	
	protected String getName () {
		return this.name;
	}
}
