

public class Paragraph implements Element {
	private String text;
	
	private AlignStrategy alignStrategy;
	
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

	@Override
	public void render() {
		if (alignStrategy != null) {
			alignStrategy.render(this, new AlignContext(AlignContext.DEFAULT_CHARACTER_LIMIT));
		} else {
			System.out.println(text);
		}
		
	}

	public AlignStrategy getAlignStrategy() {
		return alignStrategy;
	}

	public void setAlignStrategy(AlignStrategy alignStrategy) {
		this.alignStrategy = alignStrategy;
	}
	
	
	
}
