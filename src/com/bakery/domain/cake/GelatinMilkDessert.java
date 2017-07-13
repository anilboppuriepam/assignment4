package com.bakery.domain.cake;

/*
 * Created by Anil Boppuri
 * Lead L&D EPAM Systems
 * anil_boppuri@epam.com
 * as part of Advanced Java TTT Program
 *  conducted by Yahor Fralou in the month of May,2017
 *  this is the fourth and final assignment
 */
public class GelatinMilkDessert extends Cake {

	double weight;
	double amountOfSugar;
	String extraIngredients;
	double fatContent;
	double price;

	public GelatinMilkDessert() {
		 this(50,2.5,"Cashewnuts,Almonds, Peanuts",4,10);
	}

	public GelatinMilkDessert(double weight, double amountOfSugar,
			String extraIngredients, double fatContent, double price) {
		
		this.weight = weight;
		this.amountOfSugar = amountOfSugar;
		this.extraIngredients = extraIngredients;
		this.fatContent = fatContent;
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getAmountOfSugar() {
		return amountOfSugar;
	}

	public void setAmountOfSugar(double amountOfSugar) {
		this.amountOfSugar = amountOfSugar;
	}

	public String getExtraIngredients() {
		return extraIngredients;
	}

	public void setExtraIngredients(String extraIngredients) {
		this.extraIngredients = extraIngredients;
	}

	public double getFatContent() {
		return fatContent;
	}

	public void setFatContent(double fatContent) {
		this.fatContent = fatContent;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "GelatinMilkDessert [weight=" + weight + ", amountOfSugar="
				+ amountOfSugar + ", extraIngredients=" + extraIngredients
				+ ", fatContent=" + fatContent + ", price=" + price + "]";
	}

	
}
