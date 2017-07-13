package com.bakery.domain.cake;
/*
 * Created by Anil Boppuri
 * Lead L&D EPAM Systems
 * anil_boppuri@epam.com
 * as part of Advanced Java TTT Program
 *  conducted by Yahor Fralou in the month of May,2017
 *  this is the fourth and final assignment
 */
public class Pavlova extends Cake{

	private double weight;
	 private String topping;
	 private String amountOfSugar;
	 private double price;
	
	 public Pavlova() {
		 this(35.5,"Cream","Medium",3);
	}

	public Pavlova(double weight, String topping, String amountOfSugar,
			double price) {
		
		this.weight = weight;
		this.topping = topping;
		this.amountOfSugar = amountOfSugar;
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getTopping() {
		return topping;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}

	public String getAmountOfSugar() {
		return amountOfSugar;
	}

	public void setAmountOfSugar(String amountOfSugar) {
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
		return "Pavlova [weight=" + weight + ", topping=" + topping
				+ ", amountOfSugar=" + amountOfSugar + ", price=" + price + "]";
	}
	 
	 
}
