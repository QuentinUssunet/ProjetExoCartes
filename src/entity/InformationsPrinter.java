package entity;

import java.util.List;

public class InformationsPrinter {

	private static final String START_GAME = "Une nouvelle partie commence, bonne chance à tous ! ";
	private static final String DECK_READY = "Le jeu de cartes est prêt : ";
	private static final String[] PLAYER_NUMBER = {"Nom du joueur n° ", " : "};
	private static final String[] TURN_COUNTER = { "Le tour ", " commence !" };
	private static final String PLAY_CARD = " joue un(e) ";
	private static final String[] TURN_WINNER = {"Le joueur ", " gagne la manche !"};
	
	public void startGame() {
		System.out.println(START_GAME);
	}
	
	public void deckReady() {
		System.out.println(DECK_READY);
	}
	
	public void newPlayerDeclare(int playerNumber) {
		System.out.println(PLAYER_NUMBER[0] + playerNumber + PLAYER_NUMBER[1]);
	}
	
	public void turnNum(int turnNumber) {
		System.out.println(TURN_COUNTER[0] + turnNumber + TURN_COUNTER[1]);
	}
	
	public void cardPlayed(String playerName, String card) {
		System.out.println(playerName + PLAY_CARD + card);
	}

	public void turnWinner(String turnWinner) {
		System.out.println(TURN_WINNER[0] + turnWinner + TURN_WINNER[1]);
	}
	
	public void printDeck(List<Card> deck) {
		deck.forEach( card -> {
			System.out.println(card.toString());
		});
	}
}
