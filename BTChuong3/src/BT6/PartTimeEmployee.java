package BT6;

import java.util.Scanner;

public class PartTimeEmployee extends Employee{
	protected int hoursPerWeek;
	protected double Salary_per_hours;
	public PartTimeEmployee() {
		super();
	}
	public PartTimeEmployee(String name, int age, char gender,String maNV, String employerName, String dateHired,double salary,int hoursPerWeek, double salary_per_hours) {
		super(name,age,gender,maNV,employerName,dateHired,salary);
		this.hoursPerWeek = hoursPerWeek;
		this.Salary_per_hours = salary_per_hours;
	}
	public int getHoursPerWeek() {
		return hoursPerWeek;
	}
	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}
	public double getSalary_per_hours() {
		return Salary_per_hours;
	}
	public void setSalary_per_hours(double salary_per_hours) {
		Salary_per_hours = salary_per_hours;
	}
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		super.nhap();
		System.out.println("hoursPerWeek: ");
		this.hoursPerWeek=sc.nextInt();
		System.out.println("Salary_per_hours: ");
		this.Salary_per_hours=sc.nextDouble();
	}
	public double luong(int hoursPerWeek,double Salary_per_hours) {
		return hoursPerWeek*Salary_per_hours;
	}
	@Override
	public String toString() {
		return super.toString()+"PartTimeEmployee: "+luong(hoursPerWeek, Salary_per_hours);
	}
	
}
