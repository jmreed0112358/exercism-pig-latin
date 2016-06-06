package piglatin.execution;

public class RuleExecutor
{
	private final String TERMINATOR = "ay";
	private StringBuilder sb = null;
	
	
	public RuleExecutor( )
	{
		this.sb = new StringBuilder();
	}

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
		
		this.sb.append( stem ).append( chunk ).append( TERMINATOR );
		return this.sb.toString( );
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
		this.sb.append( chunk ).append( stem ).append( TERMINATOR );
		return this.sb.toString( );
	}
}
