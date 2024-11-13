package BT8;

public abstract class Shape {
	protected String color;
	public abstract double getArea();
	public abstract void nhap();
	public Shape() {
	}
	public Shape(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "color: "+color;
	}
}
