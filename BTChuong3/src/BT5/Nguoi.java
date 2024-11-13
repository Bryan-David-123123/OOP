package BT5;

import java.util.Scanner;

public class Nguoi {
	private String tenNguoi;
	private int tuoi;
	private char gioiTinh;
	public Nguoi() {
		
	}
	public Nguoi(String tenNguoi, int tuoi, char gioiTinh) {
		super();
		this.tenNguoi = tenNguoi;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
	}
	public String getTenNguoi() {
		return tenNguoi;
	}
	public int getTuoi() {
		return tuoi;
	}
	public char getGioiTinh() {
		return gioiTinh;
	}
	public void setTenNguoi(String tenNguoi) {
		this.tenNguoi = tenNguoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public void setGioiTinh(char gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	@Override
	public String toString() {
		return "Nguoi [tenNguoi=" + tenNguoi + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + "]";
	}
	protected void Nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ten nguoi: ");
		this.tenNguoi=sc.next();
		System.out.println("tuoi: ");
		this.tuoi=sc.nextInt();
		System.out.println("gioi Tinh: ");
		this.gioiTinh=sc.next().charAt(0);
	}
}
