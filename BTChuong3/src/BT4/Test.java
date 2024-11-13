package BT4;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n;
		do {
			System.out.print("n=");
			n=sc.nextInt();
		} while(n<2||n>5);
		BenhVien[] bv= new BenhVien[n];
		BenhNhan[] bn=new BenhNhan[n];
		for(int i=0;i<n;i++) {
			System.out.println("Nhap thong tin nguoi thu "+(i+1)+" : ");
			bv[i]=new BenhVien();
			bv[i].nhap();
			bn[i]=new BenhNhan();
			bn[i].nhap();
		}
		for(int i=0;i<n;i++) {
			System.out.println(bn[i]);
			System.out.println(bv[i]);
		}
		
		
//		BenhVien bv= new BenhVien("Bạch Mai","Hoàng Mai","Tuấn Giám Đốc");
//		BenhNhan bn=new BenhNhan("Hoàng",19,'M',"Ho","Covid-19",bv);
	}
}
