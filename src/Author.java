

public class Author {
	private String name;
	private String surname;
	private Book book;
	
	public Author() {
		
	}
	
	public Author(String name) {
		this.name = name;
	}

	public void print() {
		System.out.println("Author: " + getName());
	}
	
	public String getName() {
		return name;
	}
}
