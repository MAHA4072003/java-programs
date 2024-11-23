class Book {
	String name;
    double price;
    int nop; 
    String author;
    public Book(String name, double price, int nop, String author) {
        this.name = name;
        this.price = price;
        this.nop = nop;
        this.author = author;
    }
	public class MainOfBook
	{
		
			System.out.println("Book Name: " + name);
			System.out.println("Price: $" + price);
			System.out.println("Number of Pages: " + nop);
			System.out.println("Author: " + author);
		
	}
    public static void main(String[] args) {
        Book book = new Book("The Great Gatsby", 10.99, 180, "F. Scott Fitzgerald");
        
        book.displayDetails();
    }
}