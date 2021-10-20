package lab2;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
	private String name;
	private List<Image> images = new ArrayList<>();
	private List<Paragraph> paragraphs = new ArrayList<>();
	private List<Table> tables = new ArrayList<>();
	private Chapter chapter;
	
	public SubChapter() {

	}

	public SubChapter(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public List<Paragraph> getParagraphs() {
		return paragraphs;
	}

	public void setParagraphs(List<Paragraph> paragraphs) {
		this.paragraphs = paragraphs;
	}

	public List<Table> getTables() {
		return tables;
	}

	public void setTables(List<Table> tables) {
		this.tables = tables;
	}

	public Chapter getChapter() {
		return chapter;
	}

	public void setChapter(Chapter chapter) {
		this.chapter = chapter;
	}

	public void createNewParagraph(String string) {
		Paragraph paragraph = new Paragraph(string);
		paragraphs.add(paragraph);
	}

	public void createNewImage(String string) {
		Image image = new Image(string);
		images.add(image);
	}

	public void createNewTable(String string) {
		Table table = new Table(string);
		tables.add(table);
	}
	
	public void print() {
		System.out.println("Subchapter: " + getName());
		paragraphs.stream().forEach(e -> System.out.println("Paragraph: " + e));
		images.stream().forEach(i -> System.out.println("Image with name: " + i));
		tables.stream().forEach(t -> System.out.println("Table with Title: " + t));
		
	} 
	
}
