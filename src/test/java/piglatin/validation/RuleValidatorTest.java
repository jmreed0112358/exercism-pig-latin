package piglatin.validation;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;

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
	
	// Special cases:
	
	@Test
	public void test_nquRule_ValidChunk_ReturnsTrue() {
		this.ruleValidator = new RuleValidator();
		for (int i = 0 ; i < consonants.length ; i++) {
			String chunk = consonants[i] + "qu";
			String stem = "foo";
			assertTrue(this.ruleValidator.nquRuleValidate( chunk, stem ));
		}
	}
	
	@Test
	public void test_nquRule_InvalidChunk_ReturnsFalse() {
		this.ruleValidator = new RuleValidator();
		for (int i = 0 ; i < vowels.length ; i++) {
			String chunk = vowels[i] + "qu";
			String stem = "foo";
			assertFalse(this.ruleValidator.nquRuleValidate( chunk, stem ));
		}
	}
	
	@Test 
	public void test_nquRule_NullChunk_ThrowsException() {
		this.ruleValidator = new RuleValidator();
		try {
			this.ruleValidator.nquRuleValidate( null, "foo" );
			fail("Should have caught NullPointerException");
		} catch (NullPointerException npe) {
			
		}
	}
	
	@Test
	public void test_thrRule_ValidChunk_ReturnsTrue() {
		this.ruleValidator = new RuleValidator();
		assertTrue(this.ruleValidator.thrRuleValidate( "thr", "ow" ));
	}
	
	@Test
	public void test_thrRule_InvalidChunk_ReturnsFalse() {
		this.ruleValidator = new RuleValidator();
		assertFalse(this.ruleValidator.thrRuleValidate( "zoi", "ow" ));
	}
	
	@Test
	public void test_thrRule_ShortChunk_ThrowsException() {
		this.ruleValidator = new RuleValidator();
		try {
			this.ruleValidator.thrRuleValidate( "t", "foo" );
			fail("Should have caught InvalidParameterException");
		} catch (InvalidParameterException ipe) {
			
		}
	}
	
	@Test 
	public void test_thrRule_NullChunk_ThrowsException() {
		this.ruleValidator = new RuleValidator();
		try {
			this.ruleValidator.thrRuleValidate( null, "foo" );
			fail("Should have caught NullPointerException");
		} catch (NullPointerException npe) {
			
		}
	}
	
	@Test
	public void test_schRule_ValidChunk_ReturnsTrue() {
		this.ruleValidator = new RuleValidator();
		assertTrue(this.ruleValidator.schRuleValidate( "sch", "ow" ));
	}
	
	@Test
	public void test_schRule_InvalidChunk_ReturnsFalse() {
		this.ruleValidator = new RuleValidator();
		assertFalse(this.ruleValidator.schRuleValidate( "zoi", "ow" ));
	}
	
	@Test 
	public void test_schRule_NullChunk_ThrowsException() {
		this.ruleValidator = new RuleValidator();
		try {
			this.ruleValidator.schRuleValidate( null, "foo" );
			fail("Should have caught NullPointerException");
		} catch (NullPointerException npe) {
			
		}
	}
	
	@Test
	public void test_quRule_ValidChunk_ReturnsTrue() {
		this.ruleValidator = new RuleValidator();
		assertTrue(this.ruleValidator.quRuleValidate( "qu", "ow" ));
	}
	
	@Test
	public void test_quRule_InvalidChunk_ReturnsFalse() {
		this.ruleValidator = new RuleValidator();
		assertFalse(this.ruleValidator.quRuleValidate( "zo", "ow" ));
	}
	
	@Test 
	public void test_quRule_NullChunk_ThrowsException() {
		this.ruleValidator = new RuleValidator();
		try {
			this.ruleValidator.quRuleValidate( null, "foo" );
			fail("Should have caught NullPointerException");
		} catch (NullPointerException npe) {
			
		}
	}
	
	@Test
	public void test_thRule_ValidChunk_ReturnsTrue() {
		this.ruleValidator = new RuleValidator();
		assertTrue(this.ruleValidator.thRuleValidate( "th", "ow" ));
	}
	
	@Test
	public void test_thRule_InvalidChunk_ReturnsFalse() {
		this.ruleValidator = new RuleValidator();
		assertFalse(this.ruleValidator.thRuleValidate( "zo", "ow" ));
	}
	
	@Test 
	public void test_thRule_NullChunk_ThrowsException() {
		this.ruleValidator = new RuleValidator();
		try {
			this.ruleValidator.thRuleValidate( null, "foo" );
			fail("Should have caught NullPointerException");
		} catch (NullPointerException npe) {
			
		}
	}
	
	@Test
	public void test_chRule_ValidChunk_ReturnsTrue() {
		this.ruleValidator = new RuleValidator();
		assertTrue(this.ruleValidator.chRuleValidate( "ch", "ow" ));
	}
	
	@Test
	public void test_chRule_InvalidChunk_ReturnsFalse() {
		this.ruleValidator = new RuleValidator();
		assertFalse(this.ruleValidator.chRuleValidate( "zo", "ow" ));
	}
	
	@Test 
	public void test_chRule_NullChunk_ThrowsException() {
		this.ruleValidator = new RuleValidator();
		try {
			this.ruleValidator.chRuleValidate( null, "foo" );
			fail("Should have caught NullPointerException");
		} catch (NullPointerException npe) {
			
		}
	}
	
	@Test
	public void test_ytRule_ValidChunk_ReturnsTrue() {
		this.ruleValidator = new RuleValidator();
		assertTrue(this.ruleValidator.ytRuleValidate( "yt", "ow" ));
	}
	
	@Test
	public void test_ytRule_InvalidChunk_ReturnsFalse() {
		this.ruleValidator = new RuleValidator();
		assertFalse(this.ruleValidator.ytRuleValidate( "zo", "ow" ));
	}
	
	@Test 
	public void test_ytRule_NullChunk_ThrowsException() {
		this.ruleValidator = new RuleValidator();
		try {
			this.ruleValidator.ytRuleValidate( null, "foo" );
			fail("Should have caught NullPointerException");
		} catch (NullPointerException npe) {
			
		}
	}
	
	@Test
	public void test_xrRule_ValidChunk_ReturnsTrue() {
		this.ruleValidator = new RuleValidator();
		assertTrue(this.ruleValidator.xrRuleValidate( "xr", "ow" ));
	}
	
	@Test
	public void test_xrRule_InvalidChunk_ReturnsFalse() {
		this.ruleValidator = new RuleValidator();
		assertFalse(this.ruleValidator.xrRuleValidate( "zo", "ow" ));
	}
	
	@Test 
	public void test_xrRule_NullChunk_ThrowsException() {
		this.ruleValidator = new RuleValidator();
		try {
			this.ruleValidator.xrRuleValidate( null, "foo" );
			fail("Should have caught NullPointerException");
		} catch (NullPointerException npe) {
			
		}
	}
}
