/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card one = new Card("Five", "Hearts", 5);
		Card two = new Card("Five", "Hearts", 5);
		Card three = new Card("Jack", "Spades", 11);
		System.out.println(one.matches(two));
		System.out.println(two.matches(three));
		System.err.println(one.toString());
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
	}
}
