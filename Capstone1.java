package capstone1;
/*
 * @author jeanniemccarthy
 */
import java.util.*;
public class Capstone1 {
	
	public static void main(String[] args) {
		
		
		Translator translatorObject = new Translator();
		Scanner scnr = new Scanner(System.in);
		String userPhrase;
		Boolean goAgain;
		
		do {
			System.out.println("Enter a phrase to be translated into pig latin:");
			userPhrase = scnr.nextLine();
			
			if (!userPhrase.isBlank()) {
				System.out.println(translatorObject.toPigLatin(userPhrase));
				System.out.println("Would you like to translate something else? (y/n)");
				goAgain = scnr.nextLine().toLowerCase().startsWith("y");
			}
			else {
				System.out.println("I'm sorry. I didn't catch that. Please enter text.");
				goAgain = true;
			}
		} while (goAgain);
		
	
	}

}
