import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class AlignCenter implements AlignStrategy {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void render(Paragraph paragraph, AlignContext alignContext) {
		List<String> prerenderedSentences = AlignHelper.prerender(paragraph, alignContext);

		for (String sentence : prerenderedSentences) {
			int leftPadding = (alignContext.getMaximumCharactersPerLine() - sentence.length()) / 2;
			System.out.println(StringUtils.leftPad(sentence, leftPadding + sentence.length()));
		}
	}

}
