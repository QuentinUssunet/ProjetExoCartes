package service;

import java.util.ArrayList;
import java.util.List;

import entity.Card;
import entity.Player;

public class PlayerService {
	
	private List<Player> players;
	
	public PlayerService() {
		this.players = new ArrayList<>();
	}

	public List<Player> createPlayers(List<String> playersName) {
		for(String name : playersName) {
			Player player = new Player(name);
			players.add(player);
		}
		return players;
	}
	
	public void addCardToHand(Player player, Card card) {
		player.getHand().addCardToHand(card);;
	}
	
}
