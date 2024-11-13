package BT6;

import java.util.Scanner;

public class Employee extends Person{
	protected String maNV;
	protected String employerName;
	protected String dateHired;
	protected double salary;
	public Employee() {
		super();
	}
	public Employee(String name, int age, char gender,String maNV, String employerName, String dateHired,double salary) {
		super(name,age,gender);
		this.maNV = maNV;
		this.employerName = employerName;
		this.dateHired = dateHired;
		this.salary=salary;
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public String getDateHired() {
		return dateHired;
	}
	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [maNV=" + maNV + ", employerName=" + employerName + ", dateHired=" + dateHired + ", salary="
				+ salary + "]";
	}
	@Override
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap ten: ");
		this.name=sc.nextLine();
		System.out.println("Nhap tuoi: ");
		this.age=sc.nextInt();
		System.out.println("Nhap gioi tinh: ");
		this.gender=sc.next().charAt(0);sc.nextLine();
		System.out.println("Nhap ma nv: ");
		this.maNV=sc.nextLine();
		System.out.println("Employer name: ");
		this.employerName=sc.nextLine();
		System.out.println("DateHired: ");
		this.dateHired=sc.nextLine();
		System.out.println("Salary per month: ");
		this.salary=sc.nextDouble();
	}
}
