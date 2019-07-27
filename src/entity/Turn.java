package entity;

public class Turn {

	private Integer turnCounter;
	private Integer maxNumberOfTurn;

	public Turn(Integer maxNumOfTurn) {
		this.turnCounter = 0;
		this.maxNumberOfTurn = maxNumOfTurn;
	}
	
	public void incrementTurn() {
		this.turnCounter++;
	}
	
	public Integer getTurnCounter() {
		return turnCounter;
	}
	
}
