package entity;

import java.util.ArrayList;
import java.util.List;

import service.CardService;

public class Deck {

	private List<Card> deck;
	private Integer cardsNumber;
	
	private CardService cardSce = new CardService();
	
	public Deck() {
		this.deck = new ArrayList<>();
		
	}
	
	public List<Card> getDeck() {
		return deck;
	}
	
	public Integer getCardsNumber() {
		return cardsNumber;
	}

	public void setDeck(List<Card> deck) {
		this.deck = deck;
	}

	public void setCardsNumber(Integer cardsNumber) {
		this.cardsNumber = cardsNumber;
	}
	
}
