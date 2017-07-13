package com.bakery.domain.biscuit;
/*
 * Created by Anil Boppuri
 * Lead L&D EPAM Systems
 * anil_boppuri@epam.com
 * as part of Advanced Java TTT Program
 *  conducted by Yahor Fralou in the month of May,2017
 *  this is the fourth and final assignment
 */
public class Meringues extends Biscuit {
	
	private String flavor;
	private String Color;
	private double amountOfSugar;
	private String topping;
	private double price;
	public Meringues() {
		 this("Chocolate","Brown",2.5,"Dark Black",9);
	}
	public Meringues(String flavor, String color, double amountOfSugar,
			String topping, double price) {
		this.flavor = flavor;
		Color = color;
		this.amountOfSugar = amountOfSugar;
		this.topping = topping;
		this.price = price;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public double getAmountOfSugar() {
		return amountOfSugar;
	}
	public void setAmountOfSugar(double amountOfSugar) {
		this.amountOfSugar = amountOfSugar;
	}
	public String getTopping() {
		return topping;
	}
	public void setTopping(String topping) {
		this.topping = topping;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Meringues [flavor=" + flavor + ", Color=" + Color
				+ ", amountOfSugar=" + amountOfSugar + ", topping=" + topping
				+ ", price=" + price + "]";
	}
	
	

}
