package refactoring_gilbut.chap06.before;

public class BookBefore {
	private String title;
	private String isbn;
	private String price;
	private String authorName;
	private String authorMail;
	
	public BookBefore(String title, String isbn, String price, String authorName, String authorMail) {
		this.title = title;
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.authorMail = authorMail;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorMail() {
		return authorMail;
	}

	public void setAuthorMail(String authorMail) {
		this.authorMail = authorMail;
	}
	
	//
	public String toXml() {
		String author = tag("author", tag("name", authorName) + "\r\n" + tag("mail", authorMail));
		String book = tag("book", tag("title", title) + "\r\n" + tag("isbn", isbn) + "\r\n" + tag("price", price) + "\r\n" + author);
		
		return book;
	}
	
	private String tag(String element, String content) {
		return String.format("<%1$s>%2$s</%1%s>", element, content);
	}
}
