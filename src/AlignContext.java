
public class AlignContext {
	
	public static final int DEFAULT_CHARACTER_LIMIT = 20;
	
	private int maximumCharactersPerLine;

	public AlignContext(int maximumCharactersPerLine) {
		this.maximumCharactersPerLine = maximumCharactersPerLine;
	}

	public int getMaximumCharactersPerLine() {
		return maximumCharactersPerLine;
	}

	public void setMaximumCharactersPerLine(int maximumCharactersPerLine) {
		this.maximumCharactersPerLine = maximumCharactersPerLine;
	}
	
	
}
