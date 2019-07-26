package service;

import java.util.ArrayList;
import java.util.List;

import entity.Player;

public class PlayerService {

	public List<Player> createPlayers(String...names) {
		List<Player> players = new ArrayList<>();
		for(String name : names) {
			Player player = new Player(name);
			players.add(player);
		}
		return players;
	}
}
