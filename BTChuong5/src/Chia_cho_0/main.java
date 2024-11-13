package Chia_cho_0;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Nhap so bi chia: ");
			int soBiChia=sc.nextInt();
			System.out.println("Nhap so chia: ");
			int soChia=sc.nextInt();
			if(soChia==0) {
				throw new batloi("Khong the chia cho 0");
			}
			System.out.println(soBiChia/soChia);
		}catch(batloi e) {
			System.out.println(e.getMessage());
		}catch(InputMismatchException e) {
			System.out.println("Yeu cau nhap so nguyen");
		}
	}
}
