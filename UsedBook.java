

public class UsedBook extends Book {

	public UsedBook() {
		super();
			}
	
	public UsedBook(String iSBN, String author, String title, double price, String wear) {
		super(iSBN, author, title, price);
		this.wear = wear; 
	}
	
	@Override
	public String toString() {
		
		return super.toString()+ " " + String.format("Wear: %-10s", wear);
		
		//return "UsedBook [ISBN=" + ISBN + ", author=" + author + ", title=" + title + ", price=" + price + ", wear="
		//		+ wear + "]";
	}
	
	
	
	
	
}