import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	/**
	 * cards contains all the cards in the deck.
	 */
	private ArrayList<Card> cards;

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;
	private int deltSize;

	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) {
		cards = new ArrayList<Card>();
		int x = 0;
		for(int i = 0;i<(ranks.length*suits.length);i++) {
			String cardRank = ranks[i%ranks.length];
			String cardSuit = suits[x];
			int cardValue = values[i%values.length];
			Card card = new Card(cardRank, cardSuit, cardValue);
			cards.add(card);
			if(i==12)
				x++;
			if(i==25)
				x++;
			if(i==38)
				x++;
		}
		size = cards.size();
		deltSize = size;
		shuffle();
	}
	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		if(size == 0)
			return true;
		return false;
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		return size;
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
//		size = deltSize;
//		int r;
//		for(int k = cards.size()-1;k>=1;k--) {
//			r = (int)(Math.random()*k);
//			Collections.swap(cards,r,k);
//		}
		for(int b = cards.size() - 1; b > 0; b--) {
			int howMany = b + 1;
			int start = 0;
			int randPos = (int)(Math.random() * howMany) + start;
			Card temp = cards.get(b);
			cards.set(b,  cards.get(randPos));
			cards.set(randPos,  temp);
		}
		size = cards.size();
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		if(isEmpty())
			return null;
		size--;
		Card deal = cards.get(size);
		return deal;
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + deltSize + "\n" + size + " Undealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n" + (deltSize-size) + " Dealt cards: \n";
		for (int k = deltSize-1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
