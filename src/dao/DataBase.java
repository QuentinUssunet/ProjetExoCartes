package dao;

import java.util.ArrayList;
import java.util.Collection;

public class DataBase {

	private Collection <String> values;
	public enum Color {
		Pique,
		Coeur, 
		Trèfle, 
		Carreau;
	}

	public Collection<String> getValues() {
		return values;
	}

	public void setValues() {
		if(this.values == null) {
			createValues();
		} else {
			System.out.println("La liste de valeurs est déjà construite !!");
		}
	}

	private void createValues() {
		Collection<String> joker = new ArrayList<>();
		for (int i = 2; i < 11; i++) {
			joker.add(String.valueOf(i));
		}
		joker.add("Valet");
		joker.add("Dame");
		joker.add("Roi");
		joker.add("As");
	}
	
}
