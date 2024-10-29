package BT4;

import java.util.Scanner;

public class Nguoi {
	private String ten;
	private int tuoi;
	private char gioiTinh;
	public Nguoi() {
	
	}
	public Nguoi(String ten, int tuoi, char gioiTinh) {
		
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
	}
	public String getTen() {
		return ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public char getGioiTinh() {
		return gioiTinh;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public void setGioiTinh(char gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	@Override
	public String toString() {
		return " -- Ten: "+this.ten+" -- Gioi tinh: "+this.gioiTinh+" -- Tuoi: "+this.tuoi;
	}
	
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap ten: ");
		this.ten=sc.nextLine();
		System.out.println("Nhap gioi tinh: ");
		this.gioiTinh=sc.next().charAt(0);
		System.out.println("Nhap tuoi:");
		this.tuoi=sc.nextInt();
	}
}
