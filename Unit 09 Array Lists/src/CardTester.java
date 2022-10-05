/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card AceOfSpades = new Card("Ace","Spades",1);
		Card KingOfDiamonds = new Card("King","Diamonds",10);
		Card SixOfClubs = new Card("Six","Clubs",6);
		System.out.println(AceOfSpades);
		System.out.println(KingOfDiamonds);
		System.out.println(SixOfClubs);
	}
}
