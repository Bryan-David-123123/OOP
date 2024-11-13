package Ngoai_pham_vi;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Nhap luong: ");
			double luong=sc.nextDouble();
			if(luong<5000000||luong>20000000) {
				throw new OutOfRangeException("luong khong nam trong vung hop le");
			}
		} catch(OutOfRangeException e) {
			System.out.println(e.getMessage());
		}
	}
}
