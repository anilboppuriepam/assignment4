package com.bakery.domain.cake;
/*
 * Created by Anil Boppuri
 * Lead L&D EPAM Systems
 * anil_boppuri@epam.com
 * as part of Advanced Java TTT Program
 *  conducted by Yahor Fralou in the month of May,2017
 *  this is the fourth and final assignment
 */

public class Tiramisu extends Cake {

	private double weight;
	 private boolean isAlcohol;
	 private String falvored;
	 private String extraIngredients;
	 private double price;
	 
	 public Tiramisu() {
		 this(20,false,"Chocolate","Almonds, Cashewnuts,Raisins",7);
	}

	public Tiramisu(double weight, boolean isAlcohol, String falvored,
			String extraIngredients, double price) {
		
		this.weight = weight;
		this.isAlcohol = isAlcohol;
		this.falvored = falvored;
		this.extraIngredients = extraIngredients;
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isAlcohol() {
		return isAlcohol;
	}

	public void setAlcohol(boolean isAlcohol) {
		this.isAlcohol = isAlcohol;
	}

	public String getFalvored() {
		return falvored;
	}

	public void setFalvored(String falvored) {
		this.falvored = falvored;
	}

	public String getExtraIngredients() {
		return extraIngredients;
	}

	public void setExtraIngredients(String extraIngredients) {
		this.extraIngredients = extraIngredients;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Tiramisu [weight=" + weight + ", isAlcohol=" + isAlcohol
				+ ", falvored=" + falvored + ", extraIngredients="
				+ extraIngredients + ", price=" + price + "]";
	}
	 
}
