package lab2;

public class Paragraph implements Element {
	private String text;
	
	public Paragraph() {
		
	}
	
	public Paragraph(String text) {
		this.text = text;
	}
	
	public String getText() {
		return text;
	}

	public void print() {
		System.out.println("Paragraph: " + getText());
	}
	
}
