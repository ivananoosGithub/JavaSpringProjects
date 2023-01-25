package udemy_java_eclipse_exercises.Inheritance;

public class Circle {
	
	private double radius;
	private String color;

	public Circle() {
		radius = 1.0;
		color = "red";
	}
	
	public Circle(double r) {
		this.radius = r;
	}
	
	public Circle(double r, String c) {
		this.radius = r;
		this.color = c;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		return (radius * radius) * Math.PI;
	}
	
	public String toString() {
		return "Circle[radius= " +this.radius+ ",color= "+this.color+ "]";
	}
}

