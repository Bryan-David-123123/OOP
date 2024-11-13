package person;

import java.util.Scanner;

public class Person {
	private String name;
	private String dob;//Ngay sinh
	private String pob;//Noi sinh
	private char gender;
	private String email;
	private String phone;
	public Person() {
		
	}
	public Person(String name, String dob, String pob, char gender, String email, String phone) {
		this.name = name;
		this.dob = dob;
		this.pob = pob;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public String getDob() {
		return dob;
	}
	public String getPob() {
		return pob;
	}
	public char getGender() {
		return gender;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public void setPob(String pob) {
		this.pob = pob;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", dob=" + dob + ", pob=" + pob + ", gender=" + gender + ", email=" + email
				+ ", phone=" + phone + "]";
	}
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap ten: ");
		this.name=sc.nextLine();
		System.out.println("Nhap ngay sinh: ");
		this.dob=sc.nextLine();
		System.out.println("Nhap noi sinh: ");
		this.pob=sc.nextLine();
		System.out.println("Nhap gioi tinh: ");
		this.gender=sc.next().charAt(0);
		sc.nextLine();
		System.out.println("Nhap email: ");
		this.email=sc.nextLine();
		System.out.println("Nhap so dien thoai: ");
		this.phone=sc.nextLine();
	}

}	
