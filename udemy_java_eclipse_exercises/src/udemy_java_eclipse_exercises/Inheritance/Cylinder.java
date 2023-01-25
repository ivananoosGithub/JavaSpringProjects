package udemy_java_eclipse_exercises.Inheritance;

public class Cylinder extends Circle {
	
	private double height;

	public Cylinder() {
		height = 1.0;
	}
	
	public Cylinder(double radius) {
		super(radius);
	}
	
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	public Cylinder(double radius, double height, String color) {
		super(radius, color);
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume() {
		return getArea() * this.height;
	}
	
	@Override
	public double getArea() {
		return 2 * Math.PI * super.getRadius() *this.height + 2 * super.getArea();
	}
}
