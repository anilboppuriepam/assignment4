package com.bakery.domain.cake;
/*
 * Created by Anil Boppuri
 * Lead L&D EPAM Systems
 * anil_boppuri@epam.com
 * as part of Advanced Java TTT Program
 *  conducted by Yahor Fralou in the month of May,2017
 *  this is the fourth and final assignment
 */

public class GelatinFruitDessert extends Cake {
	double weight;
	boolean containsFreshFruits;
	String color;
	String flavors;
	boolean isLayered;
	double amountOfSugar;
	double price;

	public GelatinFruitDessert() {

		 this(15.5,true,"GreenMint","Pista",true,5,150);
	}

	public GelatinFruitDessert(double weight, boolean containsFreshFruits,
			String color, String flavors, boolean isLayered,
			double amountOfSugar, double price) {
		
		this.weight = weight;
		this.containsFreshFruits = containsFreshFruits;
		this.color = color;
		this.flavors = flavors;
		this.isLayered = isLayered;
		this.amountOfSugar = amountOfSugar;
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isContainsFreshFruits() {
		return containsFreshFruits;
	}

	public void setContainsFreshFruits(boolean containsFreshFruits) {
		this.containsFreshFruits = containsFreshFruits;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFlavors() {
		return flavors;
	}

	public void setFlavors(String flavors) {
		this.flavors = flavors;
	}

	public boolean isLayered() {
		return isLayered;
	}

	public void setLayered(boolean isLayered) {
		this.isLayered = isLayered;
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
		return "GelatinFruitDessert [weight=" + weight
				+ ", containsFreshFruits=" + containsFreshFruits + ", color="
				+ color + ", flavors=" + flavors + ", isLayered=" + isLayered
				+ ", amountOfSugar=" + amountOfSugar + ", price=" + price + "]";
	}

	
}
