package main;

import java.util.Scanner;

public class Book implements LibraryItem{
	protected String title;
	protected String author;
	protected int year;
	public Book() {
	
	}
	public Book(String title, String author, int year) {
		
		this.title = title;
		this.author = author;
		this.year = year;
	}
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getYear() {
		return year;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public void displayInfor() {
		System.out.println("Title:"+this.title);
		System.out.println("Author:"+this.author);
		System.out.println("Year:"+this.year);
		
		
	}
	@Override
	public String getType() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap ten loai sach:");
		return sc.nextLine();
	}

}
