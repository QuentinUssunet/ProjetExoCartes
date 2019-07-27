package service;

import java.util.ArrayList;
import java.util.Collection;

import dao.DataBase;

public class DataBaseService {
	
	private DataBase db;
	
	public DataBaseService() {
		dataBaseProvider();
		Collection<String> values = createValues();
		this.db.setValues(values);
	}

	// Singleton : permet d'éviter l'instanciation multiple de la base de données
	private DataBase dataBaseProvider() {
		if(db == null) {
			this.db = new DataBase();
		}
		return this.db;
	}

	public Collection<String> createValues() {
		Collection<String> deckValues = new ArrayList<>();
		for (int i = 2; i < 11; i++) {
			deckValues.add(String.valueOf(i));
		}
		deckValues.add("Valet");
		deckValues.add("Dame");
		deckValues.add("Roi");
		deckValues.add("As");
		
		return deckValues;
	}
	
	public DataBase getDb() {
		return dataBaseProvider();
	}
}
