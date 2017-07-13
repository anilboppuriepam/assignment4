package com.bakery.domain.cake;
/*
 * Created by Anil Boppuri
 * Lead L&D EPAM Systems
 * anil_boppuri@epam.com
 * as part of Advanced Java TTT Program
 *  conducted by Yahor Fralou in the month of May,2017
 *  this is the fourth and final assignment
 */

public class Macaron extends Cake{

	private String flavor;
	private String color;
	private double price;
	
	public Macaron() {
		 this("Chocolate","Dark Black",3);
	}

	public Macaron(String flavor, String color, double price) {
		
		this.flavor = flavor;
		this.color = color;
		this.price = price;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Macaron [flavor=" + flavor + ", color=" + color + ", price="
				+ price + "]";
	}
	
	
}
