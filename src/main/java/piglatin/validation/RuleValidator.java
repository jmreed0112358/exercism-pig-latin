package piglatin.validation;

import java.security.InvalidParameterException;

public class RuleValidator
{
	// Only need vowels, if a letter isn't here, it's a consonant.
	private char[] vowels = {'a', 'e', 'i', 'o', 'u'};

	public RuleValidator( )
	{
	}

	/**
	 * Valid for single char chunks only.
	 * @param chunk The character to check.
	 * @return boolean 
	 */
	public boolean isVowel(char chunk){
		return false;
	}
	
	/**
	 * Valid for single char chunks only.
	 * @param chunk
	 * @return boolean
	 * @throws InvalidParameterException
	 */
	public boolean isConsonant(char chunk) {
		return false;
	}
	
	// Consonant rules.
	
	/**
	 * Validates nqu rule.
	 * Note: n must be a consonant.
	 * @param chunk
	 * @param stem
	 * @return
	 */
	public boolean nquRuleValidate(String chunk, String stem) {
		return false;
	}
	
	public boolean thrRuleValidate(String chunk, String stem) {
		return false;
	}
	
	public boolean schRuleValidate(String chunk, String stem) {
		return false;
	}
	
	public boolean quRuleValidate(String chunk, String stem) {
		return false;
	}
	
	public boolean thRuleValidate(String chunk, String stem) {
		return false;
	}
	
	public boolean chRuleValidate(String chunk, String stem) {
		return false;
	}
	
	// Vowel rules.
	
	public boolean ytRuleValidate(String chunk, String stem) {
		return false;
	}
	
	public boolean xrRuleValidate(String chunk, String stem) {
		return false;
	}
	
	// Could be either consonant or vowel rule.
	
	public boolean SingleCharChunkValidate(String chunk, String stem) {
		return false;
	}
}
