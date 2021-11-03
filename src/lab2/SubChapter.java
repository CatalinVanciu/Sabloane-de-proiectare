package lab2;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
	private String name;
	private List<Element> elements = new ArrayList<>();
	
	public SubChapter() {

	}

	public SubChapter(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void createNewImage(String imageName) {
		elements.add(new Image(imageName));
	}
	
	public void createNewParagraph(String text) {
		elements.add(new Paragraph(text));
	}
	
	public void createNewTable(String title) {
		elements.add(new Table(title));
	}

	
	public void print() {
		System.out.println("Subchapter: " + getName());
		elements.stream().forEach(e -> e.print());
		
	} 
	
}
