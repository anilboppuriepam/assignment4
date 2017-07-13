package com.bakery.domain.cake;
/*
 * Created by Anil Boppuri
 * Lead L&D EPAM Systems
 * anil_boppuri@epam.com
 * as part of Advanced Java TTT Program
 *  conducted by Yahor Fralou in the month of May,2017
 *  this is the fourth and final assignment
 */
public class Mousse extends Cake{

	private double weight;
	 private String flavorBase;
	 private String sweetnessBase;
	 private double amountOfSugar;
	 private double price;
	 
	 public Mousse() {
		 this(200,"Chocolate","Honey",3,8);
	}

	public Mousse(double weight, String flavorBase, String sweetnessBase,
			double amountOfSugar, double price) {
		
		this.weight = weight;
		this.flavorBase = flavorBase;
		this.sweetnessBase = sweetnessBase;
		this.amountOfSugar = amountOfSugar;
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getFlavorBase() {
		return flavorBase;
	}

	public void setFlavorBase(String flavorBase) {
		this.flavorBase = flavorBase;
	}

	public String getSweetnessBase() {
		return sweetnessBase;
	}

	public void setSweetnessBase(String sweetnessBase) {
		this.sweetnessBase = sweetnessBase;
	}

	public double getAmountOfSugar() {
		return amountOfSugar;
	}

	public void setAmountOfSugar(double amountOfSugar) {
		this.amountOfSugar = amountOfSugar;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mousse [weight=" + weight + ", flavorBase=" + flavorBase
				+ ", sweetnessBase=" + sweetnessBase + ", amountOfSugar="
				+ amountOfSugar + ", price=" + price + "]";
	}
	 
	 
	
}
