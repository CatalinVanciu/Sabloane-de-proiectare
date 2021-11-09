package lab2;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
	private String title;
	private List<Element> elements = new ArrayList<>();

	public Section(String title) {
		this.title = title;
	}
	
	@Override
	public void print() {
		System.out.println(getTitle());
		elements.stream().forEach(e -> e.print());
	}

	@Override
	public void add(Element e) {
		elements.add(e);
	}

	@Override
	public void remove(Element e) {
		elements.remove(e);
		
	}

	@Override
	public Element get(int index) {
		return elements.get(index);
	}
	
	public String getTitle() {
		return title;
	}
	
	
}
