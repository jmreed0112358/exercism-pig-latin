package piglatin.execution;

/**
 * Words are broken down into chunks and stems.  
 * Chunks are 1 - 3 chars in length, are are checked against the vowel/consonant rules.
 * Stems are whatever chars that come after the chunk.  They can be 0 - n chars in length.
 * @author jmreed
 *
 */
public class RuleExecutor
{
	private final String TERMINATOR = "ay";

	/**
	 * Executes consonant rule on the given chunk and stem.
	 * @param chunk
	 * @param stem
	 * @return final word translated to pig latin using the consonant rule.
	 */
	public String consonantRuleExecute(String chunk, String stem) throws NullPointerException {
		if ( chunk == null || stem == null) {
			throw new NullPointerException();
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append( stem ).append( chunk ).append( TERMINATOR );
		return sb.toString( );
	}
	
	/**
	 * Executes vowel rule on the given chunk and stem.
	 * @param chunk
	 * @param stem
	 * @return final word translated to pig latin using the vowel rule.
	 */
	public String vowelRuleExecute(String chunk, String stem) throws NullPointerException {
		if ( chunk == null || stem == null) {
			throw new NullPointerException();
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append( chunk ).append( stem ).append( TERMINATOR );
		return sb.toString( );
	}
}
