package piglatin.execution;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RuleExecutorTest
{
	private RuleExecutor ruleExecutor = null;
	
	@Before
	public void setUp( ) throws Exception
	{
		this.ruleExecutor = new RuleExecutor();
	}

	@Test
	public void test_consonantRuleExecute_ThreeCharChunk_NonEmptyStem_ValidResult() {
		String chunk = "thr";
		String stem = "ow";
		String expected = "owthray";
		
		String actual = this.ruleExecutor.consonantRuleExecute( chunk, stem );
		assertEquals(expected, actual, "Didn't get expected result.");
	}
	
	@Test
	public void test_consonantRuleExecute_ThreeCharChunk_EmptyStem_ValidResult() {
		String chunk = "thr";
		String stem = "";
		String expected = "thray";
		
		String actual = this.ruleExecutor.consonantRuleExecute( chunk, stem );
		assertEquals(expected, actual, "Didn't get expected result.");
	}
	
	@Test
	public void test_consonantRuleExecute_NullChunk_NonEmptyStem_ValidResult() {
		String chunk = null;
		String stem = "ow";
		
		try {
			this.ruleExecutor.consonantRuleExecute( chunk, stem );
			fail("Should have caught a null pointer exception.");
		} catch (NullPointerException npe) {
			
		}
	}
	
	@Test
	public void test_consonantRuleExecute_ThreeChunk_NullStem_ValidResult() {
		String chunk = "thr";
		String stem = null;
		
		try {
			this.ruleExecutor.consonantRuleExecute( chunk, stem );
			fail("Should have caught a null pointer exception.");
		} catch (NullPointerException npe) {
			
		}
	}
	
	@Test
	public void test_vowelRuleExecute_ThreeCharChunk_NonEmptyStem_ValidResult() {
		String chunk = "thr";
		String stem = "ow";
		String expected = "owthray";
		
		String actual = this.ruleExecutor.consonantRuleExecute( chunk, stem );
		assertEquals(expected, actual, "Didn't get expected result.");
	}
	
	@Test
	public void test_vowelRuleExecute_ThreeCharChunk_EmptyStem_ValidResult() {
		String chunk = "thr";
		String stem = "";
		String expected = "thray";
		
		String actual = this.ruleExecutor.consonantRuleExecute( chunk, stem );
		assertEquals(expected, actual, "Didn't get expected result.");
	}
	
	@Test
	public void test_vowelRuleExecute_NullChunk_NonEmptyStem_ValidResult() {
		String chunk = null;
		String stem = "ow";
		
		try {
			this.ruleExecutor.consonantRuleExecute( chunk, stem );
			fail("Should have caught a null pointer exception.");
		} catch (NullPointerException npe) {
			
		}
	}
	
	@Test
	public void test_vowelRuleExecute_ThreeChunk_NullStem_ValidResult() {
		String chunk = "thr";
		String stem = null;
		
		try {
			this.ruleExecutor.consonantRuleExecute( chunk, stem );
			fail("Should have caught a null pointer exception.");
		} catch (NullPointerException npe) {
			
		}
	}
}
