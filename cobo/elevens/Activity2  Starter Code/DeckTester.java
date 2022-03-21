/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] rank={"A","2","3", "4", "5", "6" , "7" , "8" , "9", "10", "Jack", "Queen", "King"};
		String[] suit={"hearts","spades","diamonds", "clovers"};
		int[] val={11,2,3,4,5,6,7,8,9,10,10,10,10};
		Deck deck = new Deck(rank,suit,val);
		System.out.println(deck);
		deck.deal();
		System.out.println(deck);
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
	}
}
