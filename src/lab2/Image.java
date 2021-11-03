package lab2;

public class Image implements Element {
	private String imageName;
	
	public Image() {
		
	}
	
	public Image(String imageName) {
		this.imageName = imageName;
	}
	

	public void print() {
		System.out.println("Image: " + imageName);
	}
	
}
