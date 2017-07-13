package com.bakery.domain.cake;
/*
 * Created by Anil Boppuri
 * Lead L&D EPAM Systems
 * anil_boppuri@epam.com
 * as part of Advanced Java TTT Program
 *  conducted by Yahor Fralou in the month of May,2017
 *  this is the fourth and final assignment
 */

public class Brownie extends Cake{
	 double weight;
	 String topping;
	 String extraIngredients;
	 String chocolateType;
	 double garnish;
	 double price;
	 
	 public Brownie() {
		 this(15.5,"Chocolate","Cashewnuts","Dark Black",5,75.9);
	}

	public Brownie(double weight, String topping, String extraIngredients,
			String chocolateType, double garnish, double price) {
		
		this.weight = weight;
		this.topping = topping;
		this.extraIngredients = extraIngredients;
		this.chocolateType = chocolateType;
		this.garnish = garnish;
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

	public String getExtraIngredients() {
		return extraIngredients;
	}

	public void setExtraIngredients(String extraIngredients) {
		this.extraIngredients = extraIngredients;
	}

	public String getChocolateType() {
		return chocolateType;
	}

	public void setChocolateType(String chocolateType) {
		this.chocolateType = chocolateType;
	}

	public double getGarnish() {
		return garnish;
	}

	public void setGarnish(double garnish) {
		this.garnish = garnish;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Brownie [weight=" + weight + ", topping=" + topping
				+ ", extraIngredients=" + extraIngredients + ", chocolateType="
				+ chocolateType + ", garnish=" + garnish + ", price=" + price
				+ "]";
	}
	 
	 
}
