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

	public Card playCard() {
		// choisis une carte aléatoire parmi les cartes de la main
		int rngCardNum = (int) Math.random()*cards.size();
		Card playedCard = cards.get(rngCardNum);
		// supprime la carte joué de la main
		cards.remove(rngCardNum);
		return playedCard;
	}
	
}
