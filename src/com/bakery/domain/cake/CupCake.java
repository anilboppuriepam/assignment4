package com.bakery.domain.cake;

/*
 * Created by Anil Boppuri
 * Lead L&D EPAM Systems
 * anil_boppuri@epam.com
 * as part of Advanced Java TTT Program
 *  conducted by Yahor Fralou in the month of May,2017
 *  this is the fourth and final assignment
 */
public class CupCake  extends Cake{

	 double weight;
	 double amountOfSugar;
	 boolean fruitFilling;
	 double price;
	 
	public CupCake(){
		
		this(25.5, 3, true,7);
	} 
	public CupCake(double weight, double amountOfSugar, boolean fruitFilling,
			double price) {
		
		this.weight = weight;
		this.amountOfSugar = amountOfSugar;
		this.fruitFilling = fruitFilling;
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
	public boolean isFruitFilling() {
		return fruitFilling;
	}
	public void setFruitFilling(boolean fruitFilling) {
		this.fruitFilling = fruitFilling;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Cupcake [weight=" + weight + ", amountOfSugar=" + amountOfSugar
				+ ", fruitFilling=" + fruitFilling + ", price=" + price + "]";
	}
	 
	 
}
