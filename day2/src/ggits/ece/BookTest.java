package ggits.ece;

class Book {
	private int noOfPages;
	private String authorName;
	private String title;
	
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNoOfPages() {
		return noOfPages;
	}
}

public class BookTest {
	public static void main(String[] args) {
		Book book1 = new Book();
		/*book1.authorName = "Dan Brown";
		book1.title = "Angels and Demons";
		book1.noOfPages = 500;
		System.out.println(book1.authorName);
		System.out.println(book1.title);
		System.out.println(book1.noOfPages);*/
	}
}
