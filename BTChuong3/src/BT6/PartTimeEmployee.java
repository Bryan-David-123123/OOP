package BT6;

import java.util.Scanner;

public class PartTimeEmployee {
	private int hoursPerWeek;

	public PartTimeEmployee() {
		
	}

	public PartTimeEmployee(int hoursPerWeek) {
		super();
		this.hoursPerWeek = hoursPerWeek;
	}

	public int getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	@Override
	public String toString() {
		return "PartTimeEmployee [hoursPerWeek=" + hoursPerWeek + "]";
	}
	
	protected void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhap so gio lam viec: ");
		this.hoursPerWeek=sc.nextInt();
	}
}
