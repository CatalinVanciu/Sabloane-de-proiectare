import java.util.ArrayList;
import java.util.List;

public class AlignHelper {
	
	public static List<String> prerender(Paragraph paragraph, AlignContext alignContext) {
		int maxChars = alignContext.getMaximumCharactersPerLine();

		String[] sentences = paragraph.getText().replaceAll("[ \t]+", " ").split("\n");
		List<String> prerenderedSentences = new ArrayList<String>();

		for (String sentence : sentences) {
			while (sentence.length() > maxChars) {
				int latestDelimiterPosition = sentence.lastIndexOf(" ", maxChars - 1);
				if (latestDelimiterPosition == -1) {
					prerenderedSentences.add(sentence.substring(0, maxChars));
					sentence = sentence.substring(maxChars);
				} else {
					prerenderedSentences.add(sentence.substring(0, latestDelimiterPosition));
					sentence = sentence.substring(latestDelimiterPosition + 1);
				}
			}

			prerenderedSentences.add(sentence);
		}

		return prerenderedSentences;
	}
}
