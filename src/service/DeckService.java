package service;

import java.util.List;

import dao.DataBase;
import entity.Card;
import entity.Deck;
import entity.Player;

public class DeckService {

	private DataBaseService dbSce = new DataBaseService();
	private CardService cardSce = new CardService();
	private PlayerService playerSce = new PlayerService();
	
	public Deck init() {
		Deck deck = new Deck();
		DataBase db = dbSce.getDb();
		List<Card> cards = cardSce.createCards(db.getValues());
		deck.setDeck(cards);
		deck.setCardsNumber(cards.size());
		return deck;
	}
	
	public void cardDistribution(List<Card> cards, List<Player> players) {
		for (int i = 1; i < Math.round(cards.size()/players.size()); i++) {
			int j = 1;
			for(Player player : players) {
				Card card = cards.get(i*j);
				playerSce.addCardToHand(player, card);
				j++;
			}
		}
	}
}
