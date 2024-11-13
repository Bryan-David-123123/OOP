package BT7;

public class Circle implements GeometricObject{

	double radius=1.0;
	public Circle(double radius) {

		this.radius = radius;
	}

	public double circle(double radius) {
		return radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getPerimeter() {
		return 2*Math.PI*this.radius;
	}

	@Override
	public double getArea() {
		return Math.PI*this.radius*this.radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getPerimeter()=" + getPerimeter() + ", getArea()=" + getArea() + "]";
	}
	
	
	
}
