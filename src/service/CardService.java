package service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import dao.DataBase.Color;
import entity.Card;

public class CardService {

	public List<Card> createCards(Collection<String> values) {
		List<Card> cards = new ArrayList<>();
		List<Color> colors = createColorList();
		for(Color color : colors) {
			Integer cost = 1;
			for(String value : values) {
				Card newCard = new Card(value, color, cost);
				cards.add(newCard);
				cost++;
			}
		}
		return cards;
	}

	private List<Color> createColorList() {
		List<Color> colors = new ArrayList<>();
		colors.add(Color.Pique);
		colors.add(Color.Coeur);
		colors.add(Color.Trèfle);
		colors.add(Color.Carreau);
		return colors;
	}
	
}
