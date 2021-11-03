package lab2;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private String title;
	private List<Author> authors = new ArrayList<>();
	private List<Chapter> chapters = new ArrayList<>();
	private TableOfContents tableOfContents;
	
	public Book() {

	}
	
	public Book(String title) {
		this.title = title;
	}

	public void addAuthor(Author author) {
		authors.add(author);
	}
	
	public int createChapter(String chapter) {
		Chapter chapterObj = new Chapter(chapter);
		chapters.add(chapterObj);
		return chapters.indexOf(chapterObj);
	}
	
	public Chapter getChapter(int index) {
		return chapters.get(index);
	}
	
	public void print() {
		
	}
}
