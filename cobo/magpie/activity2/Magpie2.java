/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 *
 * QCC:
 * What happens when more than one keyword appears in a string? Consider the string “My mother has a dog but no cat.”
 * Explain how to prioritize responses in the reply method.
 * 	- When more than one keyword is present, the response is prioritized from top to bottom in the code, so the keyword highest up in the if else chain determiens the response
 * What happens when a keyword is included in another word? Consider statements like “I know all the state capitals” and “I like vegetables smothered in cheese.”
 * Explain the problem with the responses to these statements.
 *	- The keywords are embedded within other words, so the responses given would not make sense
 */
public class Magpie2
{
	/**
	 * Get a default greeting
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 *
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.indexOf("dog") >= 0
				|| statement.indexOf("cat") >= 0)
		{
			response = "Tell me more about your pets.";
		}
		else if (statement.indexOf("Mykolyk") >= 0)
		{
			response = "He sounds like a good teacher.";
		}
    else if (statement.indexOf("justin") >= 0)
		{
			response = "He sounds like a good justin.";
		}
    else if (statement.indexOf("jonathan") >= 0)
		{
			response = "He sounds like a good jonathan.";
		}
    else if (statement.indexOf("kevin") >= 0)
		{
			response = "He sounds like a good kevin.";
		}
		else if ((statement.trim()).length() == 0)
		{
			response = "Say something, please.";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			response = "Go on.";
		}
		else if (whichResponse == 5)
		{
			response = "That sounds nice.";
		}

		return response;
	}
}
