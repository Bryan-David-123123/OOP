package BT4;

import java.util.Scanner;

public class BenhNhan extends Nguoi{
	private String tienSu;
	private String chuanDoan;
	private BenhVien benhVien;
	public BenhNhan() {
		super();
	}
	public BenhNhan(String ten, int tuoi, char gioiTinh ,String tienSu, String chuanDoan, BenhVien benhVien) {
		super(ten,tuoi,gioiTinh);
		this.tienSu = tienSu;
		this.chuanDoan = chuanDoan;
		this.benhVien = benhVien;
	}
	public String getTienSu() {
		return tienSu;
	}
	public String getChuanDoan() {
		return chuanDoan;
	}
	public BenhVien getBenhVien() {
		return benhVien;
	}
	public void setTienSu(String tienSu) {
		this.tienSu = tienSu;
	}
	public void setChuanDoan(String chuanDoan) {
		this.chuanDoan = chuanDoan;
	}
	public void setBenhVien(BenhVien benhVien) {
		this.benhVien = benhVien;
	}
	@Override
	public String toString() {
		return super.toString()+" -- Tien su: "+this.tienSu+" -- Chuan doan: "+this.chuanDoan+" -- Benh vien: "+this.benhVien;
	}
	
	public void nhap() {
		super.nhap();
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap tien su: ");
		this.tienSu=sc.nextLine();
		System.out.println("Nhap chuan doan: ");
		this.chuanDoan=sc.nextLine();
	}
}
