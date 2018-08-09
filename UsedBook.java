package com.lab18;

public class UsedBook extends Book {

//	private String ISBN;
//	private String author;
//	private String title;
//	private double price;
	private String wear;
	/**
	 * 
	 */
	public UsedBook() {
		super();
			}
	
	public UsedBook(String iSBN, String author, String title, double price, String wear) {
		super(iSBN, author, title, price);
		this.wear = wear; // same name override with "this" keyword
	}
	
	@Override
	public String toString() {
		
		return super.toString()+ " " + String.format("Wear: %-10s", wear);
		
		//return "UsedBook [ISBN=" + ISBN + ", author=" + author + ", title=" + title + ", price=" + price + ", wear="
		//		+ wear + "]";
	}
	
	
	
	
	
}