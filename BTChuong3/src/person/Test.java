package person;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=0;
		try {
			System.out.println("n= ");
			n=sc.nextInt();
			if(n<0) {
				throw new NLaSoAmException("Yeu cau nhap n la so am");
			}
		} catch (NLaSoAmException e) {
			System.out.println(e.getMessage());
		} catch(InputMismatchException h) {
			System.out.println("Yeu cau nhap n la so nguyen");
		}
		
		Person[] p=new Person[n];
		for(int i=0;i<n;i++) {
			p[i]=new Person();
		}
		for(int i=0;i<n;i++) {
			System.out.println("Nhap Person["+i+"]:");
			p[i].nhap();
		}
		for(int i=0;i<n;i++) {
			System.out.println(p[i].toString());
		}
	}
}
