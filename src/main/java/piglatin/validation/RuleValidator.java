package piglatin.validation;

import java.security.InvalidParameterException;

/**
 * Checks chunks for validity against vowel / consonant rules.
 * Words are broken down into chunks and stems.  
 * Chunks are 1 - 3 chars in length, are are checked against the vowel/consonant rules.
 * Stems are whatever chars that come after the chunk.  They can be 0 - n chars in length.
 * @author jmreed
 *
 */
public class RuleValidator
{
	// Only need vowels, if a letter isn't here, it's a consonant.
	private char[] vowels = {'a', 'e', 'i', 'o', 'u'};

	/**
	 * Valid for single char chunks only.
	 * @param chunk The character to check.
	 * @return boolean 
	 */
	public boolean isVowel(char letter){
		for (int i = 0 ; i < vowels.length ; i++ ) {
			if (letter == vowels[i]) {
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
	public boolean isConsonant(char letter) {
		return !this.isVowel( letter );
	}
	
	// Consonant rules.
	
	/**
	 * nqu rule, where n represents any consonant.
	 * @param chunk
	 * @param stem
	 * @return
	 */
	public boolean nquRuleValidate(String chunk, String stem) {
		if (chunk.length( ) != 3) {
			throw new InvalidParameterException("Chunk must be 3 chars long");
		}
		
		// Check characters one by one.
		return (this.isConsonant( chunk.charAt( 0 ) ) && chunk.charAt( 1 ) == 'q' && chunk.charAt( 2 ) == 'u');
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
