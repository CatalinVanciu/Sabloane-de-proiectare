

public class DocumentManager {
	
	private static final DocumentManager INSTANCE = new DocumentManager();
	
	private Book book;
	
	private DocumentManager() {
		
	}
	
	public static DocumentManager getInstance() {
		return INSTANCE;
	}
	
	public Book getBook() {
		return book;
	}
	
	public void setBook(Book book) {
		this.book = book;
	}
}
