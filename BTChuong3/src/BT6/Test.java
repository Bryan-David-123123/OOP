package BT6;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n;
		do {
			System.out.print("n=");
			n=sc.nextInt();
		} while(n<=0);
		Person[] p=new Person[n];
		for(int i=0;i<n;i++) {
			System.out.println("Nhap thong tin nguoi thu "+(i+1));
			p[i]=new Person();
			p[i].nhap();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(p[i].toString());
		}
	}
}
