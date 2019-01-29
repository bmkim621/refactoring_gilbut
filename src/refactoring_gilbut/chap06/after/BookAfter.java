package refactoring_gilbut.chap06.after;

public class BookAfter {
	private String title;
	private String isbn;
	private String price;
	private Author authour;

	public BookAfter(String title, String isbn, String price, String authorName, String authorMail) {
		this.title = title;
		this.isbn = isbn;
		this.price = price;
		//author
		this.authour = new Author(authorName, authorMail);
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
		//위임
		return authour.getAuthorName();
	}

	public void setAuthorName(String authorName) {
		//위임
		this.authour.setAuthorName(authorName);
	}

	public String getAuthorMail() {
		//위임
		return authour.getAuthorMail();
	}

	public void setAuthorMail(String authorMail) {
		//위임
		this.authour.setAuthorMail(authorMail);
	}
	
	//
	public String toXml() {
		String author = tag("author", tag("name", authour.getAuthorName()) + "\r\n" + tag("mail", authour.getAuthorMail()));
		String book = tag("book", tag("title", title) + "\r\n" + tag("isbn", isbn) + "\r\n" + tag("price", price) + "\r\n" + author);
		
		return book;
	}
	
	private String tag(String element, String content) {
		return String.format("<%1$s>%2$s</%1%s>", element, content);
	}
}
