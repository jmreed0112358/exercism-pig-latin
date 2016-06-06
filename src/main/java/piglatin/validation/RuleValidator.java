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
		for (int i = 0 ; i < vowels.length ; i++ ) {
			if (chunk == vowels[i]) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Valid for single char chunks only.
	 * @param chunk
	 * @return boolean
	 * @throws InvalidParameterException
	 */
	public boolean isConsonant(char chunk) {
		return !this.isVowel( chunk );
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
		if (chunk.length( ) != 3) {
			throw new InvalidParameterException("Chunk must be 3 chars long");
		}
		return chunk.equals( "thr" );
	}
	
	public boolean schRuleValidate(String chunk, String stem) {
		if (chunk.length( ) != 3) {
			throw new InvalidParameterException("Chunk must be 3 chars long");
		}
		return chunk.equals( "sch" );
	}
	
	public boolean quRuleValidate(String chunk, String stem) {
		if (chunk.length( ) != 2) {
			throw new InvalidParameterException("Chunk must be 2 chars long");
		}
		return chunk.equals( "qu" );
	}
	
	public boolean thRuleValidate(String chunk, String stem) {
		if (chunk.length( ) != 2) {
			throw new InvalidParameterException("Chunk must be 2 chars long");
		}
		return chunk.equals( "th" );
	}
	
	public boolean chRuleValidate(String chunk, String stem) {
		if (chunk.length( ) != 2) {
			throw new InvalidParameterException("Chunk must be 2 chars long");
		}
		return chunk.equals( "ch" );
	}
	
	// Vowel rules.
	
	public boolean ytRuleValidate(String chunk, String stem) {
		if (chunk.length( ) != 2) {
			throw new InvalidParameterException("Chunk must be 2 chars long");
		}
		return chunk.equals( "yt" );
	}
	
	public boolean xrRuleValidate(String chunk, String stem) {
		if (chunk.length( ) != 2) {
			throw new InvalidParameterException("Chunk must be 2 chars long");
		}
		return chunk.equals( "xr" );
	}
}
