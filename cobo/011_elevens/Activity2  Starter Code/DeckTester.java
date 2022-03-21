/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] rank={"1","2","3"};
		String[] suit={"hearts","spades","diamonds"};
		int[] val={1,2,3};
		Deck deck = new Deck(rank,suit,val);
		System.out.println(deck);
		deck.deal();
		System.out.println(deck);
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
	}
}
