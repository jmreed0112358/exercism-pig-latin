package piglatin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import piglatin.execution.RuleExecutor;
import piglatin.validation.RuleValidator;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

// Each of these tests are integration tests.

@RunWith(Parameterized.class)
public class PigLatinTest {

    private String input;
    private String expectedOutput;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                // Ay is added to words that start with vowels
                {"apple", "appleay"},
                {"ear", "earay"},
                {"igloo", "iglooay"},
                {"object", "objectay"},
                {"under", "underay"},
                {"ax", "axay"},
                {"a", "aay"},

                // First letter and ay are moved to the end of words that start with consonants
                {"pig", "igpay"},
                {"koala", "oalakay"},
                {"yellow", "ellowyay"},
                {"xenon", "enonxay"},
                {"xi", "ixay"},
                {"x", "xay"},

                // Ch is treated like a single consonant
                {"chair", "airchay"},

                // Qu is treated like a single consonant
                {"queen", "eenquay"},

                // Qu and a single preceding consonant are treated like a single consonant
                {"square", "aresquay"},

                // Th is treated like a single consonant
                {"therapy", "erapythay"},

                // Thr is treated like a single consonant
                {"thrush", "ushthray"},

                // Sch is treated like a single consonant
                {"school", "oolschay"},

                // Yt is treated like a single vowel
                {"yttria", "yttriaay"},

                // Xr is treated like a single vowel
                {"xray", "xrayay"},

                // Phrases are translated
                {"quick fast run", "ickquay astfay unray"},
                {"a short quill nquill fo", "aay hortsay illquay illnquay ofay"}
        });
    }

    public PigLatinTest(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Test
    public void test() {
        assertEquals(expectedOutput, PigLatin.translate(input));
    }
    
    @Test
    public void test_translate_EmptyString_ReturnsEmptyString() {
    	assertEquals("", PigLatin.translate( "" ));
    }
    
    @Test
    public void test_translate_NullString_ThrowsException() {
    	try {
    		PigLatin.translate( null );
    		fail("Should throw NullPointerException");
    	} catch ( NullPointerException npe) {
    		
    	} catch (Exception e) {
    		fail("Didn't catch the correct exception!");
    	}
    }
    
    @Test
    public void test_threeCharChunkChecks_ValidWord() {
    	RuleValidator ruleValidator = new RuleValidator();
    	RuleExecutor ruleExecutor = new RuleExecutor();
    	
    	assertEquals("owzquay", PigLatin.threeCharChunkChecks( "zquow", ruleValidator, ruleExecutor ));
    }
    
    @Test
    public void test_threeCharChecks_InvalidWord() {
    	RuleValidator ruleValidator = new RuleValidator();
    	RuleExecutor ruleExecutor = new RuleExecutor();
    	
    	assertEquals(null, PigLatin.threeCharChunkChecks( "ooooo", ruleValidator, ruleExecutor ));
    }
    
    @Test
    public void test_threeCharChecks_WordTooShort() {
    	RuleValidator ruleValidator = new RuleValidator();
    	RuleExecutor ruleExecutor = new RuleExecutor();
    	
    	assertEquals(null, PigLatin.threeCharChunkChecks( "oo", ruleValidator, ruleExecutor ));
    }
    
    @Test
    public void test_twoCharChunkChecks_ValidWord() {
    	RuleValidator ruleValidator = new RuleValidator();
    	RuleExecutor ruleExecutor = new RuleExecutor();
    	
    	assertEquals("owquay", PigLatin.twoCharChunkChecks( "quow", ruleValidator, ruleExecutor ));
    }
    
    @Test
    public void test_twoCharChecks_InvalidWord() {
    	RuleValidator ruleValidator = new RuleValidator();
    	RuleExecutor ruleExecutor = new RuleExecutor();
    	
    	assertEquals(null, PigLatin.twoCharChunkChecks( "ooooo", ruleValidator, ruleExecutor ));
    }
    
    @Test
    public void test_twoCharChecks_WordTooShort() {
    	RuleValidator ruleValidator = new RuleValidator();
    	RuleExecutor ruleExecutor = new RuleExecutor();
    	
    	assertEquals(null, PigLatin.twoCharChunkChecks( "o", ruleValidator, ruleExecutor ));
    }
    
    @Test
    public void test_singleCharChunkChecks_ValidWordConsonant() {
    	RuleValidator ruleValidator = new RuleValidator();
    	RuleExecutor ruleExecutor = new RuleExecutor();
    	
    	assertEquals("oofay", PigLatin.singleCharChunkChecks( "foo", ruleValidator, ruleExecutor ));
    }
    
    @Test
    public void test_singleCharChunkChecks_ValidWordVowel() {
    	RuleValidator ruleValidator = new RuleValidator();
    	RuleExecutor ruleExecutor = new RuleExecutor();
    	
    	assertEquals("aooay", PigLatin.singleCharChunkChecks( "aoo", ruleValidator, ruleExecutor ));
    }
    
    @Test
    public void test_singleCharChecks_EmptyWord() {
    	RuleValidator ruleValidator = new RuleValidator();
    	RuleExecutor ruleExecutor = new RuleExecutor();
    	
    	assertEquals(null, PigLatin.singleCharChunkChecks( "", ruleValidator, ruleExecutor ));
    }
}
