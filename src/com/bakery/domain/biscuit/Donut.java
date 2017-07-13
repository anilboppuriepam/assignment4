package com.bakery.domain.biscuit;

/*
 * Created by Anil Boppuri
 * Lead L&D EPAM Systems
 * anil_boppuri@epam.com
 * as part of Advanced Java TTT Program
 *  conducted by Yahor Fralou in the month of May,2017
 *  this is the fourth and final assignment
 */
public class Donut extends Biscuit {

	private double weight;
	private String topping;
	private double price;
	
	public Donut() {
		 this(10,"Chocolate Cashewnuts",4);
	}

	public Donut(double weight, String topping, double price) {
		this.weight = weight;
		this.topping = topping;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Donut [weight=" + weight + ", topping=" + topping + ", price="
				+ price + "]";
	}
	
}
