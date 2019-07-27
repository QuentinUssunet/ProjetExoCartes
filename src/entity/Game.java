package entity;

import java.util.List;
import java.util.Scanner;

import service.DeckService;
import service.PlayerService;

public class Game {

	private Deck deck;
	private List<Player> players;
	
	private PlayerService playerSce = new PlayerService();
	private DeckService deckSce = new DeckService();
	
	public void init() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Une nouvelle partie commence, bonne chance à tous !");
		
		// Construction du Deck
		deck = deckSce.init();
		System.out.println("Le jeu de cartes est prêt : ");
		
		// Déclaration des joueurs
		System.out.println("Nom du premier joueur : ");
		String player1 = sc.next();
		System.out.println("Nom du second joueur : ");
		String player2 = sc.next();
		System.out.println("Nom du troisième joueur : ");
		String player3 = sc.next();
		System.out.println("Nom du dernier joueur : ");
		String player4 = sc.next();
		
		// Création des joueurs
		players = playerSce.createPlayers(player1, player2, player3, player4);
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
