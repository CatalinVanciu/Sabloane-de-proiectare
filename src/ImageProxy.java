
import java.awt.Dimension;

public class ImageProxy implements Picture, Element {
	private String url;
	private Image realImg;
	
	public ImageProxy(String url) {
		this.url = url;
	}
	
	private Image loadImage() {
		if (realImg == null) {
			realImg = new Image(url);
		}

		return realImg;
	}

	@Override
	public void print() {
		loadImage();
		realImg.print();
		
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
		if(realImg != null) {
			return realImg.dim();
		}
		
		return null;
	}

	@Override
	public PictureContent content() {
		// TODO Auto-generated method stub
		return null;
	}
}
