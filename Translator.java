package capstone1;
/*
 * @author jeanniemccarthy
 */
public class Translator {
	public String toPigLatin(String userPhrase) {
		
		LocatePunctuation locatePunctuationObject = new LocatePunctuation();
		LocateFirstVowel locateFirstVowelObject = new LocateFirstVowel();
		String[] userWords = userPhrase.split(" ");
		String pigWord = "";
		String pigPhrase = "";
		int indexOfVowel1;
		int punctuationIndex;
		String punctuation;
		
		
		
		translate: for (String word : userWords) {
			
			punctuationIndex = locatePunctuationObject.locatePunctuation(word);
			punctuation = (punctuationIndex != -1) ? String.valueOf(word.charAt(punctuationIndex)) : "";
			
//			char[] userChars = word.toCharArray();
//			for (char eachChar : userChars) {
//				if (punctuationIndex == -1 && !Character.isAlphabetic(eachChar)) {
//					pigWord = word;
//					continue translate;
//				}
//			}
			
			indexOfVowel1 = locateFirstVowelObject.locateFirstVowel(word);
			
			if ((indexOfVowel1 == 0) && (punctuationIndex == -1)) {
				pigWord = word + "way ";
			}
			else if ((indexOfVowel1 == 0) && (punctuationIndex != -1)) {
				pigWord = word.substring(0, word.length()-1) + "way" + punctuation + " ";
			}
			else if ((indexOfVowel1 != 0) && (punctuationIndex == -1)) {
				String substringPre = word.substring(0, indexOfVowel1);
				String substringPost = word.substring(indexOfVowel1, word.length());
				pigWord = substringPost  + substringPre + "ay ";
			}
			else if ((indexOfVowel1 != 0) && (punctuationIndex != -1)) {
				String substringPre = word.substring(0, indexOfVowel1);
				String substringPost = word.substring(indexOfVowel1, word.length()-1);
				pigWord = substringPost + substringPre + "ay" + punctuation + " ";
			}
			else {
				pigWord = "ERROR";
			}
			
			pigPhrase += pigWord;
		}
		return pigPhrase;
	}
}
