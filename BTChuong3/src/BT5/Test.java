package BT5;

public class Test {
	public static void main(String[] args) {
		Truong truong=new Truong("DHCNHN","Nhon","Pham Xuan Thuc");
		SinhVien sv=new SinhVien("Khanh",19,'M',"CNTT02","CNTT",truong);
		System.out.println(sv);
	}
}
