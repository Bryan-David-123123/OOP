package main;

public class Textbook extends Book implements LibraryItem{
	private String subject;
	public Textbook() {
		super();
	}
	public Textbook(String title, String author, int year,String subject) {
		super(title,author,year);
		this.subject = subject;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}


	@Override
	public void displayInfor() {
		super.displayInfor();
		System.out.println("subject:"+this.subject);
	}
}
