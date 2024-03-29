package udemy_java_eclipse_exercises;

public class Rectangle {
	
	private float length;
	private float width;

	public Rectangle() {
		this.length = 1.0F;
		this.width = 1.0F;
	}
	
	public Rectangle(float Length, float Width) {
		this.length = Length;
		this.width = Width;
	}
	
	public float getLength() {
		return this.length;
	}
	
	public void setLength(float Length) {
		this.length = Length;
	}
	
	public float getWidth() {
		return this.width;
	}
	
	public void setWidth(float Width) {
		this.width = Width;
	}
	
	public double getArea() {
		return this.length * this.width;
	}
	
	public double getPerimeter() {
		return 2*(this.length+this.width);
	}
	
	public String toString() {
		return "Rectangle[length= "+this.length+ ", width = " +this.width+ "]";
	}

}
