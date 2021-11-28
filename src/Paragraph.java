

public class Paragraph implements Element {
	private String text;
	
	public Paragraph(String text) {
		this.text = text;
	}
	
	public String getText() {
		return text;
	}

	@Override
	public void print() {
		System.out.println("Paragraph: " + getText());
	}

	@Override
	public void add(Element e) {
		
	}

	@Override
	public void remove(Element e) {
		
	}

	@Override
	public Element get(int index) {
		return null;
	}
	
}
