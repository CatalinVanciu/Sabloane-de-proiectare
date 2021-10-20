package lab2;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private String title;
	private List<Author> authors = new ArrayList<>();
	private List<Chapter> chapters = new ArrayList<>();
	
	public Book() {

	}
	
	public Book(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public List<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(List<Chapter> chapters) {
		this.chapters = chapters;
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
