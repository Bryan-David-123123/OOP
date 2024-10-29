package BT5;

import java.util.Scanner;

public class SinhVien extends Nguoi{
	private String lop;
	private String nganh;
	private Truong truong;
	public SinhVien() {
		super();
	}
	public SinhVien(String tenNguoi, int tuoi, char gioiTinh, String lop, String nganh, Truong truong) {
		super(tenNguoi,tuoi,gioiTinh);
		this.lop = lop;
		this.nganh = nganh;
		this.truong = truong;
	}
	public String getLop() {
		return lop;
	}
	public String getNganh() {
		return nganh;
	}
	public Truong getTruong() {
		return truong;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public void setNganh(String nganh) {
		this.nganh = nganh;
	}
	public void setTruong(Truong truong) {
		this.truong = truong;
	}
	@Override
	public String toString() {
		return super.toString() +"SinhVien [lop=" + lop + ", nganh=" + nganh + ", truong=" + truong + "]";
	}
	
	protected void Nhap() {
		super.Nhap();
		Scanner sc=new Scanner(System.in);
		System.out.println("Lop: ");
		this.lop=sc.next();
		System.out.println("Nganh: ");
		this.nganh=sc.next();
	}
}
