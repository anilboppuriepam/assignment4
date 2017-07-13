package com.bakery.domain.biscuit;

/*
 * Created by Anil Boppuri
 * Lead L&D EPAM Systems
 * anil_boppuri@epam.com
 * as part of Advanced Java TTT Program
 *  conducted by Yahor Fralou in the month of May,2017
 *  this is the fourth and final assignment
 */
public class CandiedFruit extends Biscuit {

	 private String fruit;
	 private boolean isPeel;
	 private double amountOfSugar;
	 private double price;
	 
	 public CandiedFruit() {
		 this("Strawberry",true,5,13);
		}

	public CandiedFruit(String fruit, boolean isPeel, double amountOfSugar,
			double price) {
		this.fruit = fruit;
		this.isPeel = isPeel;
		this.amountOfSugar = amountOfSugar;
		this.price = price;
	}

	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}

	public boolean isPeel() {
		return isPeel;
	}

	public void setPeel(boolean isPeel) {
		this.isPeel = isPeel;
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
		return "CandiedFruit [fruit=" + fruit + ", isPeel=" + isPeel
				+ ", amountOfSugar=" + amountOfSugar + ", price=" + price + "]";
	}
	 
}
