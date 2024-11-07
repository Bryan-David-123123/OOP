package core;

import java.util.Scanner;

public class Circle implements GeometricObject{
	protected double radius;
	
	public Circle()  {
		
	}
	

	public Circle(double radius)  {
		
		this.radius = radius;
	}

	

//	public double getRadius() {
//		return radius;
//	}
//
//
//	public void setRadius(double radius) {
//		this.radius = radius;
//	}


	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*Math.PI*this.radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radius, 2);
	}
	
	public void nhap() throws batloi{
		Scanner sc=new Scanner(System.in);
		System.out.println("radius= ");
		this.radius=sc.nextDouble();
		if(radius<=0) {
			throw new batloi("Radius phai >0");
		}
	}	
}
