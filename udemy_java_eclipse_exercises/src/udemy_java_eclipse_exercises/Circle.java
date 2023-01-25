package udemy_java_eclipse_exercises;
/**
 * The Circle class models a circle with a radius and color.
 */
public class Circle {  // Save as "Circle.java"
	
	private double radius;
	
	public Circle () {
		this.radius = 1.0;
	}
	
	public Circle (double radius){
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius (double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		
		return (radius * radius) * Math.PI;
	}
	
	public double getCircumference() {
		
		return 2 * Math.PI * radius;
	}
	
	public String toString() {
		
		return "Circle[radius = " +this.radius+ "]";
	}
	
}






