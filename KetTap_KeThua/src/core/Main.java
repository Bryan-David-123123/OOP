package core;

public class Main {
	public static void main(String[] args) {
		Hinh[] h=new Hinh[2];
		HinhChuNhat hcn= new HinhChuNhat("Hinh chu nhat",4,3);
		HinhTron ht=new HinhTron("Hinh tron",2);
		
		h[0]=hcn;
		h[1]=ht;
		for(int i=0;i<h.length;i++)
		{
			System.out.println(h[i]);
		}
	}
}	
