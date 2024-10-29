package BT6;

import java.util.Scanner;

public class Employee extends PartTimeEmployee{
	private String employerName;
	private String dateHired;
	public Employee() {
		super();
	}
	public Employee(int hoursPerWeek,String employerName, String dateHired) {
		super(hoursPerWeek);
		this.employerName = employerName;
		this.dateHired = dateHired;
	}
	public String getEmployerName() {
		return employerName;
	}
	public String getDateHired() {
		return dateHired;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}
	@Override
	public String toString() {
		return super.toString()+"Employee [employerName=" + employerName + ", dateHired=" + dateHired + "]";
	}
	protected void nhap() {
		super.nhap();
		Scanner sc =new Scanner(System.in);
		System.out.print("Nhap ten employer: ");
		this.employerName=sc.nextLine();
		System.out.print("Nhap ngay thue: ");
		this.dateHired=sc.nextLine();
	}
}
