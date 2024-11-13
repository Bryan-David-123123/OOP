package BT8;

import java.util.Scanner;

public class Rectangle extends Shape {
	protected int length;
	protected int width;
	public Rectangle() {
		super();
	}
	public Rectangle(String color,int length, int width) {
		super(color);
		this.length = length;
		this.width = width;
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	

	@Override
	public String toString() {
		return super.toString()+"Rectangle [length=" + length + ", width=" + width + ", getArea()=" + getArea() + "]";
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.length*this.width;
	}
	
	@Override
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Color: ");
		this.color=sc.nextLine();
		System.out.println("Length: ");
		this.length=sc.nextInt();
		System.out.println("width");
		this.width=sc.nextInt();
	}
}
