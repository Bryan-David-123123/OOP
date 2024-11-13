package main;

public class Novel extends Book implements LibraryItem{
	private String genre;

	public Novel() {
		super();
	}

	public Novel(String title, String author, int year,String genre) {
		super(title,author,year);
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	@Override
	public void displayInfor() {
		super.displayInfor();
		System.out.println("Genre:"+this.genre);
	}
}
