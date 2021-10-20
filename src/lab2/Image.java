package lab2;

public class Image {
	private String imageName;
	private SubChapter subChapter;
	
	public Image() {
		
	}
	
	public Image(String imageName) {
		this.imageName = imageName;
	}
	
	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
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
