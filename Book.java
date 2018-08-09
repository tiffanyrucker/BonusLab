

public class Book {
	
	private String ISBN;
	private String author;
	private String title;
	private double price;

	public Book() {
		super();
	}

	// constructor
	public Book(String iSBN, String author, String title, double price) {
		super();
		ISBN = iSBN;
		this.author = author;
		this.title = title;
		this.price = price;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {

		return String.format("ISBN: %-20s Author: %-20s Title: %-20s Price: %-20s", ISBN, author, title, price);
		// return "Book [ISBN=" + ISBN + ", author=" + author + ", title=" + title + ",
		// price=" + price + "]";
	}

}