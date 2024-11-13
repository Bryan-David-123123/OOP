package main;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyDanhSach{
	private ArrayList<Book> danhSach=new ArrayList<>();
	public QuanLyDanhSach() {	
	}
	public QuanLyDanhSach(ArrayList<Book> danhSach) {
		this.danhSach = danhSach;
	}
	public void create(Book sach) {
		this.danhSach.add(sach);
	}
	public void read() {
		for (Book book : danhSach) {
			book.displayInfor();
		}
	}
	public void update(int index,Book sach) {
		if(index>=0&&index<danhSach.size()) {
			danhSach.set(index, sach);
		}
	}
	public void delete(int index) {
		if(index>=0&&index<danhSach.size()) {
			danhSach.remove(index);
		}
	}
}
