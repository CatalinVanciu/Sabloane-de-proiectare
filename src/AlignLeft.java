import java.util.List;

public class AlignLeft implements AlignStrategy {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void render(Paragraph paragraph, AlignContext alignContext) {
		List<String> prerenderedSentences = AlignHelper.prerender(paragraph, alignContext);

		prerenderedSentences.forEach(System.out::println);
	}

}
