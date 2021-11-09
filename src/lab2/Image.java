package lab2;

public class Image implements Element {
	private String url;
	
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
	
}
