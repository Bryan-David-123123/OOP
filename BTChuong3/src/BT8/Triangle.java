package BT8;

import java.util.Scanner;

public class Triangle extends Shape{
	protected int base;
	protected int height;
	
	
	public Triangle() {
		super();
	}
	
	
	public Triangle(String color,int base, int height) {
		super(color);
		this.base = base;
		this.height = height;
	}

	
	public int getBase() {
		return base;
	}


	public void setBase(int base) {
		this.base = base;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}




	
	@Override
	public String toString() {
		return super.toString()+"Triangle [base=" + base + ", height=" + height + ", getArea()=" + getArea() + "]";
	}


	@Override
	public double getArea() {
		return 0.5*this.base*this.height;
	}
	
	@Override
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Color: ");
		this.color=sc.nextLine();
		System.out.println("Base: ");
		this.base=sc.nextInt();
		System.out.println("Height: ");
		this.height=sc.nextInt();
	}

}
