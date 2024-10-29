package core;

public class HinhChuNhat extends Hinh{
	private double chieuDai;
	private double chieuRong;
	public HinhChuNhat() {
		super();
	}
	public HinhChuNhat(String tenHinh, double chieuDai, double chieuRong) {
		super(tenHinh);
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	public double getChieuDai() {
		return chieuDai;
	}
	public double getChieuRong() {
		return chieuRong;
	}
	public void setChieuDai(double chieuDai) {
		this.chieuDai = chieuDai;
	}
	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}
	@Override
	protected double tinhChuVi() {
		return (this.chieuDai+this.chieuRong)*2;
	}
	protected double tinhDienTich() {
		return this.chieuDai*this.chieuRong;
	}
	@Override
	public String toString() {
		return "Chieu dai:  "+this.chieuDai+"Chieu rong: "+this.chieuRong+"Chu vi: "+this.tinhChuVi()+"DIen tich: "+this.tinhDienTich();
	}
}
