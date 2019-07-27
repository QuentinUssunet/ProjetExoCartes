package service;

import entity.Turn;

public class TurnService {

	private Turn turn;
	
	public TurnService() {
		this.turn = new Turn();
	}
	
	public Integer computeMaxNumOfTurn(Integer cardsNum, Integer playerNum) {
		return Math.round(cardsNum/playerNum);
	}

	public Turn getTurn() {
		return turn;
	}
	
}
