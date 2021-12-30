package lab.java;

class Author {
	private String name, email;
	private char gender;
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	@Override
	public String toString() {
		String authorDetails=null;
		
		String title = null;
		if(gender=='m' || gender=='M')
			title = "Mr ";
		else if(gender=='f' || gender=='F')
			title = "Ms/Mrs ";
		else
			title = "";
		
		authorDetails = name+"\nEmail: "+email;
		
		return title+authorDetails;
	}
	
	
}
class Book {
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	
	public Book(String name, Author author, double price, int qtyInStock) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	@Override
	public String toString() {
		String bookDetails=null;
		bookDetails = "Title: "+name+"\nAuthor: "+author.toString()+"\nPrice: Rs."
		+price+"\nAvailable in Stock: "+qtyInStock;
		return bookDetails;
	}
	
}
public class Experiment7 {
	public static void main(String[] args) {
		Author a1 = new Author("Dan Brown","danbrown123@gmail.com",'M');
		Book b1 = new Book("Angels & Demons",a1,550.00,5);
		System.out.println(b1.toString());
	}
}
