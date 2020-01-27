package capstone1;
/*
 * @author jeanniemccarthy
 */
public class LocateFirstVowel {
	public int locateFirstVowel(String word) {
		
		final String vowels = "AEIOUaeiou";
		
		for (int i = 0; i < word.length(); i++) {
			if (vowels.contains(String.valueOf(word.charAt(i)))) {
				return i;
			}
		}
	return -1;
	}
}
