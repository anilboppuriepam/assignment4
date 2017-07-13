package com.bakery.domain.cake;

/*
 * Created by Anil Boppuri
 * Lead L&D EPAM Systems
 * anil_boppuri@epam.com
 * as part of Advanced Java TTT Program
 *  conducted by Yahor Fralou in the month of May,2017
 *  this is the fourth and final assignment
 */
public class CheeseCake extends Cake{
	 double weight;
	 String flavor;
	 String topping;
	 String cheeseType;
	 double price;
	public CheeseCake(double weight, String flavor, String topping,
			String cheeseType, double price) {
		
		this.weight = weight;
		this.flavor = flavor;
		this.topping = topping;
		this.cheeseType = cheeseType;
		this.price = price;
	}
	public CheeseCake() {
		 this(35,"Strawberry","Cream","FrenchCheese",57);
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public String getTopping() {
		return topping;
	}
	public void setTopping(String topping) {
		this.topping = topping;
	}
	public String getCheeseType() {
		return cheeseType;
	}
	public void setCheeseType(String cheeseType) {
		this.cheeseType = cheeseType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "CheeseCake [weight=" + weight + ", flavor=" + flavor
				+ ", topping=" + topping + ", cheeseType=" + cheeseType
				+ ", price=" + price + "]";
	}
	 
	 
}
