package lab2;

import java.util.ArrayList;
import java.util.List;

public class Book extends Section {
	private List<Author> authors = new ArrayList<>();
	
	public Book(String title) {
		super(title);
	}

	public void addAuthor(Author author) {
		authors.add(author);
	}
	
	public void print() {
		System.out.println("Book: " + super.getTitle());
		System.out.println("Authors: ");
		authors.stream().forEach(e -> e.print());
		super.print();
	}

	public void addContent(Paragraph paragraph) {
		
	}
}
