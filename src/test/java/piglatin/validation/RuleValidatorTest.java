package piglatin.validation;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RuleValidatorTest
{
	private RuleValidator ruleValidator = null;
	private char[] vowels = {'a', 'e', 'i', 'o', 'u' };
	private char[] consonants = { 'q', 'w', 'r', 't', 'y', 'p', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm' };

	@Before
	public void setUp( ) throws Exception
	{
	}

	// isVowel tests.
	
	@Test
	public void test_isVowel_VowelChunk_ReturnsTrue() {
		this.ruleValidator = new RuleValidator();
		for ( int i = 0 ; i < vowels.length ; i++ ) {
			assertTrue(this.ruleValidator.isVowel( vowels[i] ));
		}
	}
	
	@Test
	public void test_isVowel_ConsonantChunk_ReturnsFalse() {
		this.ruleValidator = new RuleValidator();
		for (int i = 0 ; i < consonants.length ; i++ ) {
			assertFalse(this.ruleValidator.isVowel( consonants[i] ));
		}
	}

	// isConsonant tests.
	@Test
	public void test_isConsonant_ConsonantChunk_ReturnsTrue() {
		this.ruleValidator = new RuleValidator();
		for (int i = 0 ; i < consonants.length ; i++ ) {
			assertTrue(this.ruleValidator.isConsonant( consonants[i] ));
		}
	}
	
	@Test
	public void test_isConsonant_VowelChunk_ReturnsFalse() {
		this.ruleValidator = new RuleValidator();
		for ( int i = 0 ; i < vowels.length ; i++ ) {
			assertFalse(this.ruleValidator.isConsonant( vowels[i] ));
		}
	}
}
