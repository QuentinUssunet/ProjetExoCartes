package entity;

public class Player {

	private String name;
	private Integer victoryCount;
	
	public Player(String name) {
		this.name = name;
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
}
