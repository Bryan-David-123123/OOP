package main;

public class main {
	public static void main(String[] args) {
		QuanLyDanhSach ql=new QuanLyDanhSach();
		ql.create(new Textbook("Sach giao khoa","VKhanh",2024,"Math"));
		ql.create(new Novel("Chi Dau","Ngo Tat To",2023,"Gia Dinh"));
		ql.create(new Textbook("Sach my thuat","Linh",2000,"My thuat"));
		ql.read();
		System.out.println("-----------------------------");
		ql.delete(1);
		ql.read();
		System.out.println("-----------------------------");
		ql.update(0, new Novel("Dua caom cho me ra dong","Tran Dang Khoa",1998,"Gia Dinh"));
		ql.read();
	}
}
