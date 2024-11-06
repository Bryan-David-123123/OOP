package bai6nangcao;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,m;
		do {
			System.out.println("n=");
			n=sc.nextInt();
		} while(n<2||n>5);
		Employee em[]=new Employee[n];
		for(int i=0;i<n;i++) {
			em[i]=new Employee();
			em[i].nhap();
		}
		do {
			System.out.println("m=");
			m=sc.nextInt();
		} while(n<2||n>5);
		PartTimeEmployee pem[]=new PartTimeEmployee[m];
		for(int i=0;i<m;i++) {
			pem[i]=new PartTimeEmployee();
			pem[i].nhap();
		}
		for(int i=0;i<n;i++) {
			System.out.println(em[i].toString());
		}
		for(int i=0;i<m;i++) {
			System.out.println(pem[i].toString());
		}
		
	}
}
