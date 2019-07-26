package entity;

import dao.DataBase.Color;

public class Card {

	private String value;
	private Color color;
	private Integer cost;
	
	public Card(String value, Color color, Integer cost) {
		this.value = value;
		this.color = color;
		this.cost = cost;
	}
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Integer getCost() {
		return cost;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	
	public String toString() {
		return value + " de " + color.toString();
	}
}
