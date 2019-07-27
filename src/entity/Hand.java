package entity;

import java.util.ArrayList;
import java.util.List;

public class Hand {

	private List<Card> cards;
	
	public Hand() {
		this.cards = new ArrayList<>();
	}

	public List<Card> getCards() {
		return cards;
	}

	public void addCardToHand(Card card) {
		this.cards.add(card);
	}
	
}
