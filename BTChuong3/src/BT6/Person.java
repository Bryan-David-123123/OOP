package BT6;

import java.util.Scanner;

public class Person extends Employee{
	private String name;
	private int age;
	private char gender;
	public Person() {
		super();
	}
	public Person(int hoursPerWeek,String employerName,String dateHired,String name, int age, char gender) {
		super(hoursPerWeek,employerName,dateHired);
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return super.toString()+"Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	protected void nhap() {

		super.nhap();
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhap ten cong nhan: ");
		this.name=sc.nextLine();
		System.out.print("Nhap tuoi cong nhan: ");
		this.age=sc.nextInt();
		System.out.print("Nhap gioi tinh: ");
		this.gender=sc.next().charAt(0);
	}
	
}
