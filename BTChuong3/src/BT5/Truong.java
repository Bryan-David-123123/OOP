package BT5;

import java.util.Scanner;

public class Truong {
	private String tenTruong;
	private String diaChi;
	private String hieuTruong;
	public Truong() {
		
	}
	public Truong(String tenTruong, String diaChi, String hieuTruong) {
		
		this.tenTruong = tenTruong;
		this.diaChi = diaChi;
		this.hieuTruong = hieuTruong;
	}
	public String getTenTruong() {
		return tenTruong;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public String getHieuTruong() {
		return hieuTruong;
	}
	public void setTenTruong(String tenTruong) {
		this.tenTruong = tenTruong;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public void setHieuTruong(String hieuTruong) {
		this.hieuTruong = hieuTruong;
	}
	@Override
	public String toString() {
		return "Truong [tenTruong=" + tenTruong + ", diaChi=" + diaChi + ", hieuTruong=" + hieuTruong + "]";
	}
	
	protected void Nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ten truong: ");
		this.tenTruong=sc.next();
		System.out.println("Dia chi: ");
		this.diaChi=sc.next();
		System.out.println("Ten hieu truong: ");
		this.hieuTruong=sc.next();
	}
}
