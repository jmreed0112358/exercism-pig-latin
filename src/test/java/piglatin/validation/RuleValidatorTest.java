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
	
	@Test
	public void test_nquRule_ValidChunk_ReturnsTrue() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test_nquRule_InvalidChunk_ReturnsFalse() {
		fail("Not yet implemented");
	}
	
	@Test 
	public void test_nquRule_NullChunk_ThrowsException() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test_thrRule_ValidChunk_ReturnsTrue() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test_thrRule_InvalidChunk_ReturnsFalse() {
		fail("Not yet implemented");
	}
	
	@Test 
	public void test_thrRule_NullChunk_ThrowsException() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test_schRule_ValidChunk_ReturnsTrue() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test_schRule_InvalidChunk_ReturnsFalse() {
		fail("Not yet implemented");
	}
	
	@Test 
	public void test_schRule_NullChunk_ThrowsException() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test_quRule_ValidChunk_ReturnsTrue() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test_quRule_InvalidChunk_ReturnsFalse() {
		fail("Not yet implemented");
	}
	
	@Test 
	public void test_quRule_NullChunk_ThrowsException() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test_thRule_ValidChunk_ReturnsTrue() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test_thRule_InvalidChunk_ReturnsFalse() {
		fail("Not yet implemented");
	}
	
	@Test 
	public void test_thRule_NullChunk_ThrowsException() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test_chRule_ValidChunk_ReturnsTrue() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test_chRule_InvalidChunk_ReturnsFalse() {
		fail("Not yet implemented");
	}
	
	@Test 
	public void test_chRule_NullChunk_ThrowsException() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test_ytRule_ValidChunk_ReturnsTrue() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test_ytRule_InvalidChunk_ReturnsFalse() {
		fail("Not yet implemented");
	}
	
	@Test 
	public void test_ytRule_NullChunk_ThrowsException() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test_singleCharChunkRule_ValidChunk_ReturnsTrue() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test_singleCharChunkRule_InvalidChunk_ReturnsFalse() {
		fail("Not yet implemented");
	}
	
	@Test 
	public void test_singleCharChunkRule_NullChunk_ThrowsException() {
		fail("Not yet implemented");
	}
}
