package service;

import entity.Turn;

public class TurnService {

	private Turn turn;
	
	public TurnService() {
		this.turn = new Turn(computeMaxNbrOfTurn(cardsNum, playerNum));
	}
	
	public Integer computeMaxNbrOfTurn(Integer cardsNum, Integer playerNum) {
		return 1;
	}

	public Turn getTurn() {
		return turn;
	}
	
}
