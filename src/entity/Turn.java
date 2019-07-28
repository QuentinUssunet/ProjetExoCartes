package entity;

public class Turn {

	private Integer turnCounter;
	private Integer maxNumberOfTurn;

	public Turn() {
		this.turnCounter = 0;
	}
	
	public void incrementTurn() {
		this.turnCounter++;
	}
	
	public Integer getTurnCounter() {
		return turnCounter;
	}

	public Integer getMaxNumberOfTurn() {
		return maxNumberOfTurn;
	}

	public void setMaxNumberOfTurn(Integer maxNumberOfTurn) {
		this.maxNumberOfTurn = maxNumberOfTurn;
	}
	
}
