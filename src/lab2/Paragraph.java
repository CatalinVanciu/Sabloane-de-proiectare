package lab2;

public class Paragraph {
	private String text;
	private SubChapter subChapter;
	
	public Paragraph() {
		
	}
	
	public Paragraph(String text) {
		this.text = text;
	}
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public SubChapter getSubChapter() {
		return subChapter;
	}

	public void setSubChapter(SubChapter subChapter) {
		this.subChapter = subChapter;
	}

	public void print() {
		
	}
}
