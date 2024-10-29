package core;

public class Test {
	public static void main(String[] args) {
		double n1=10;
		double n2=20;
		PhepToan p=new PhepToan();
		System.out.println("Tong: "+p.cong(n1, n2));
		System.out.println("Tru: "+p.tru(n1, n2));
		System.out.println("Nhan: "+p.nhan(n1, n2));
		System.out.println("Chia: "+p.chia(n1, n2));
	}
}
