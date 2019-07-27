package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import service.DeckService;
import service.PlayerService;
import service.TurnService;

public class Game {

	private Deck deck;
	private List<Player> players;
	
	private PlayerService playerSce = new PlayerService();
	private DeckService deckSce = new DeckService();
	private TurnService turnSce = new TurnService();
	
	public void init() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Une nouvelle partie commence, bonne chance à tous !");
		
		// Construction du Deck
		deck = deckSce.init();
		System.out.println("Le jeu de cartes est prêt : ");
		// Affichage du deck
		deck.getDeck().forEach( card -> {
			System.out.println(card.toString());
		});
		
		List<Card> deckCards = deck.getDeck();
		
		List<String> playersName = new ArrayList<>();
		// Déclaration des joueurs
		for (int i = 1; i < 5; i++) {
			System.out.println("Nom du joueur n° " + i + " : ");
			String playerName = sc.next();
			playersName.add(playerName);
		}
		
		// Création des joueurs
		players = playerSce.createPlayers(playersName);
		
		// Le jeu contient 52 cartes et se joue à 4 joueurs
		// le nombre de manches est donc de 52 / 4 .round()
		Integer turnNumber = turnSce.computeMaxNumOfTurn(deckCards.size(), players.size());
		turnSce.getTurn().setMaxNumOfTurn(turnNumber);
		
		// TODO Mélange des cartes
		
		// Distribution des cartes
		
	}
	
	// Effectue un tour de jeu
	public void round() {
		Turn turn = turnSce.getTurn();
		turn.incrementTurn();
		Integer turnCounter = turn.getTurnCounter();
		
		System.out.println("Le tour "+ turnCounter +" commence !");
	}
	
	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

}
