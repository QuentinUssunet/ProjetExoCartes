package entity;

public class Turn {

	private Integer turnCounter;

	public void incrementTurn() {
		this.turnCounter++;
	}
	
	public Integer getTurnCounter() {
		return turnCounter;
	}
	
}
