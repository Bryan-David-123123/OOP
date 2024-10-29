package core;

public class HinhTron extends Hinh{
	private double banKinh;

	public HinhTron() {
		super();
	}

	public HinhTron(String tenHinh, double banKinh) {
		super();
		this.banKinh = banKinh;
	}

	public double getBanKinh() {
		return banKinh;
	}

	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}
	@Override
	protected double tinhChuVi() {
		return this.banKinh*2*3.14;
	}
	@Override
	protected double tinhDienTich() {
		return this.banKinh*this.banKinh*3.14;
	}

	@Override
	public String toString() {
		return ("Ban kinh: "+this.banKinh +"Chu vi: "+this.tinhChuVi()+"Dien tich: "+this.tinhDienTich());
	}
	
	
}
