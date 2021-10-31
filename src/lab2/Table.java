package lab2;

public class Table {
	private String title;
	private SubChapter subChapter;
	
	public Table() {
		
	}
	
	public Table(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public SubChapter getSubChapter() {
		return subChapter;
	}

	public void setSubChapter(SubChapter subChapter) {
		this.subChapter = subChapter;
	}

	public void print() {
		
	}
	
	public String toString() {
		return title;
	}
}
