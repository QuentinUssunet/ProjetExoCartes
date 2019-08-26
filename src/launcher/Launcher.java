package launcher;

import entity.Game;

public class Launcher {
	
	public static void main(String[] args) {
		Game game = new Game();
		game.init();
		game .round();
	}
	
}
