package capstone1;

public class LocatePunctuation {
	public int locatePunctuation(String word) {
		
		final String punctuation = "?!.,:;-";
		
		for (int i = 0; i < word.length(); i++) {
			if (punctuation.contains(String.valueOf(word.charAt(i)))) {
				return i;
			}
		}
	return -1;
	}
}
