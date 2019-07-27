package entity;

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
		
		// Le jeu contient 52 cartes et se joue à 4 joueurs
		// le nombre de manches est donc de 52 / 4 .round()
		Integer tunrNumber = turnSce.
		
	}
	
	public void round() {
		
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
