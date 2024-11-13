package BT7;

public class ResizeableCircle extends Circle implements Resizeable{

	public ResizeableCircle(double radius) {
		super(radius);
	}
	
	@Override
	public double resize(int percent) {
		return percent*this.radius;
	}
	
	@Override
	public double getPerimeter() {
		return 2*Math.PI*this.radius;
	}

	@Override
	public double getArea() {
		return Math.PI*this.radius*this.radius;
	}
	
}
