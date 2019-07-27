package entity;

public class Player {

	private String name;
	private Hand hand;
	private Integer victoryCount;
	
	public Player(String name) {
		this.name = name;
		this.hand = new Hand();
	}

	public String getName() {
		return name;
	}

	public Integer getVictoryCount() {
		return victoryCount;
	}

	public void setVictoryCount(Integer newVictoryCount) {
		this.victoryCount = newVictoryCount;
	}

	public Hand getHand() {
		return this.hand;
	}
}
