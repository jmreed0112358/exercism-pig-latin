package piglatin.validation;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RuleValidatorTest
{
	private RuleValidator ruleValidator = null;
	
	@Before
	public void setUp( ) throws Exception
	{
	}

	// isVowel tests.
	
	@Test
	public void test_isVowel_VowelChunk_ReturnsTrue() {
		this.ruleValidator = new RuleValidator();
		assertTrue(this.ruleValidator.isVowel( 'a' ));
	}
	
	@Test
	public void test_isVowel_ConsonantChunk_ReturnsFalse() {
		this.ruleValidator = new RuleValidator();
		assertFalse(this.ruleValidator.isVowel( 'z' ));
	}

	// isConsonant tests.
	@Test
	public void test_isConsonant_ConsonantChunk_ReturnsTrue() {
		this.ruleValidator = new RuleValidator();
		assertTrue(this.ruleValidator.isConsonant( 'z' ));
	}
	
	@Test
	public void test_isConsonant_VowelChunk_ReturnsFalse() {
		this.ruleValidator = new RuleValidator();
		assertFalse(this.ruleValidator.isConsonant( 'a' ));
	}
}
