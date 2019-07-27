package service;

import java.util.List;

import dao.DataBase;
import entity.Card;
import entity.Deck;

public class DeckService {

	private DataBaseService dbSce = new DataBaseService();
	private CardService cardSce = new CardService();
	
	public Deck init() {
		Deck deck = new Deck();
		DataBase db = dbSce.getDb();
		List<Card> cards = cardSce.createCards(db.getValues());
		deck.setDeck(cards);
		deck.setCardsNumber(cards.size());
		return deck;
	}
	
}
