package dao;

import java.util.ArrayList;
import java.util.Collection;

public class DataBase {

	private Collection<String> values;
	public enum Color {
		Pique,
		Coeur, 
		Trèfle, 
		Carreau;
	}

	public Collection<String> getValues() {
		return values;
	}

	public void setValues(Collection<String> values) {
		this.values = values;
	}
}
