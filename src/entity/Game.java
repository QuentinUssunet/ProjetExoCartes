package entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
		turnSce.getTurn().setMaxNumberOfTurn(turnNumber);
		
		// TODO Mélange des cartes
		
		// Distribution des cartes
		deckSce.cardDistribution(deck.getDeck(), players);
	}
	
	// Effectue un tour de jeu
	public void round() {
		Turn turn = turnSce.getTurn();
		turn.incrementTurn();
		Integer turnCounter = turn.getTurnCounter();
		
		if(turnCounter.equals(turn.getMaxNumberOfTurn())) {
			endOfGame();
		}
		
		Map<Player, Card> cardsPlayed = new HashMap<Player, Card>();
		
		System.out.println("Le tour "+ turnCounter +" commence !");
		// Sélection d'une carte par joueur
		for(Player player : players) {
			Card playedCard = player.getHand().playCard();
			System.out.println(player.getName() + " joue un(e) " + playedCard.toString());
			cardsPlayed.put(player, playedCard);
		}
		 
		// Comparaison des cartes jouées, désignation du vainqueur du tour
		deckSce.comparePlayedCardsAndGetWinner(cardsPlayed);
	}
	
	private void endOfGame() {
		// TODO Auto-generated method stub
		
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
