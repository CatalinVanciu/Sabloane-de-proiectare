import java.awt.Dimension;

public class Image implements Picture, Element {
	
	private String url;
	private ImageContent content;
	
	public Image() {
		
	}
	
	public Image(String url) {
		this.url = url;
	}
	

	@Override
	public void print() {
		System.out.println("Image: " + url);
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
	public String url() {
		return url;
	}

	@Override
	public Dimension dim() {
		return new Dimension(content.getWidth(), content.getHeight());
	}

	@Override
	public PictureContent content() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
