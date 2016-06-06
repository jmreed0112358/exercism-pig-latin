package piglatin;

import piglatin.execution.RuleExecutor;
import piglatin.validation.RuleValidator;

public class PigLatin
{
	public PigLatin( )
	{
	}

	public static String translate(String input) throws NullPointerException {
		// Check for null string.
		if (input == null) {
			throw new NullPointerException();
		}
		// Check for empty string.
		if (input.isEmpty( ) ) {
			return "";
		}
		// Reduce all characters to lower case.
		input = input.toLowerCase( );
		
		RuleValidator ruleValidator = new RuleValidator();
		RuleExecutor ruleExecutor = new RuleExecutor();
		
		// Tokenize string.  Split at spaces, handle multiple spaces.
		String[] tokens = input.split( "\\s+" );
		StringBuilder sb = new StringBuilder();
		String result = "";
		// For each word in the string.
		for ( int i = 0 ; i < tokens.length ; i++ ) {
			// If the word is 3 chars or longer.
			String word = threeCharChunkChecks(tokens[i], ruleValidator, ruleExecutor);
			if ( word != null) {
				sb.append( word );
				if ( i != tokens.length - 1 ) {
					sb.append( " " );
				}
				continue;
			}
			
			word = twoCharChunkChecks(tokens[i], ruleValidator, ruleExecutor);
			if (word != null) {
				sb.append( word );
				if ( i != tokens.length - 1 ) {
					sb.append( " " );
				}
				continue;
			}
			
			word = singleCharChunkChecks(tokens[i], ruleValidator, ruleExecutor);
			if (word != null) {
				sb.append( word );
				if ( i != tokens.length - 1 ) {
					sb.append( " " );
				}
			}
		}

		return sb.toString();
	}
	
	public static String threeCharChunkChecks(String word, RuleValidator ruleValidator, RuleExecutor ruleExecutor) {
		if (word.length( ) < 3) {
			return null;
		}
		
		String chunk = word.substring( 0, 3 );
		String stem = word.substring( 3, word.length( ) );
		
		if ( ruleValidator.nquRuleValidate( chunk, stem ) || ruleValidator.thrRuleValidate( chunk, stem ) 
				|| ruleValidator.schRuleValidate( chunk, stem )) {
			return ruleExecutor.consonantRuleExecute( chunk, stem );
		} 
		
		return null;
	}
	
	public static String twoCharChunkChecks(String word, RuleValidator ruleValidator, RuleExecutor ruleExecutor) {
		if (word.length( ) < 2) {
			return null;
		}
		
		String chunk = word.substring( 0, 2 );
		String stem = word.substring( 2, word.length( ) );
		
		if ( ruleValidator.quRuleValidate( chunk, stem ) || ruleValidator.thRuleValidate( chunk, stem ) 
				|| ruleValidator.chRuleValidate( chunk, stem ) ) {
			return ruleExecutor.consonantRuleExecute( chunk, stem );
		} else if ( ruleValidator.ytRuleValidate( chunk, stem ) || ruleValidator.xrRuleValidate( chunk, stem ) ) {
			return ruleExecutor.vowelRuleExecute( chunk, stem );
		} 
		
		return null;
	}
	
	public static String singleCharChunkChecks(String word, RuleValidator ruleValidator, RuleExecutor ruleExecutor) {
		if (word.isEmpty( )) {
			return null;
		}
		
		String chunk = word.substring( 0, 1 );
		String stem = word.substring( 1, word.length( ) );
		
		if ( ruleValidator.isVowel( word.charAt( 0 ) )) {
			return ruleExecutor.vowelRuleExecute( chunk, stem );
		} else {
			return ruleExecutor.consonantRuleExecute( chunk, stem );
		}
	}
}
