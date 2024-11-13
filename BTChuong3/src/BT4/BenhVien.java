package BT4;

import java.util.Scanner;

public class BenhVien {
	private String ten;
	private String diaChi;
	private String giamDoc;
	public BenhVien() {
		
	}
	public BenhVien(String ten, String diaChi, String giamDoc) {
		
		this.ten = ten;
		this.diaChi = diaChi;
		this.giamDoc = giamDoc;
	}
	public String getTen() {
		return ten;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public String getGiamDoc() {
		return giamDoc;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public void setGiamDoc(String giamDoc) {
		this.giamDoc = giamDoc;
	}
	@Override
	public String toString() {
		return " {Tên bệnh viện: "+this.ten+" -- Dia chi: "+this.diaChi+" -- Ten giam doc: "+this.giamDoc+"}";
	}
	
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap ten vien: ");
		this.ten=sc.nextLine();
		System.out.println("Nhap dia chi: ");
		this.diaChi=sc.nextLine();
		System.out.println("Nhap ten giam doc:");
		this.giamDoc=sc.nextLine();
	}
}
