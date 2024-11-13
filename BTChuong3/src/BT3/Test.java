package BT3;

public class Test {
	public static void main(String[] args) {
		DiaChi dc= new DiaChi("Yen Thai","Tien Yen","Hoai Duc","Ha Noi");
		NhanVien nv=new NhanVien("Khanh",dc,"24/11/2005",'M');
		System.out.println(nv.toString());
	}
}
