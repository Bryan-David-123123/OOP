package core;

public abstract class Hinh {
	private String tenHinh;
	protected abstract double tinhChuVi();
	protected abstract double tinhDienTich();
	public Hinh() {
	}
	public Hinh(String tenHinh) {
		this.tenHinh = tenHinh;
	}
	public String getTenHinh() {
		return tenHinh;
	}
	public void setTenHinh(String tenHinh) {
		this.tenHinh = tenHinh;
	}
	
}
