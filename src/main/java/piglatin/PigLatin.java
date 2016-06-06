package piglatin;

public class PigLatin
{

	public PigLatin( )
	{
		// TODO Auto-generated constructor stub
	}

	public static String translate(String input) {
		// Check for null string.
		// Check for empty string.
		// Reduce all characters to lower case.
		// Tokenize string.
		// For each word in the string.
			// If the word is 3 chars or longer.
				// nQU check.
				// Thr check.
				// Sch check.
		
			// If the word is 2 chars or longer.
			// If the word is 1 char or longer.
		return "Foo";
	}
	
	/**
	 * Checks to see if the given 3 letter chunk matches the nQU rule, where n is a consonant, followed by the letters qu.
	 * This chunk is treated as a single consonant.
	 * @param chunk 3 letter chunk to be checked.
	 * @return
	 */
	private boolean nquRuleCheck(String chunk) {
		return false;
	}
	
	/**
	 * Applies the nqu rule, we treat this like a consonant.
	 * @param word
	 * @return
	 */
	private String applyNquRule(String word) {
		return "";
	}
}
