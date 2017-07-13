package com.bakery.domain.bun;
/*
 * Created by Anil Boppuri
 * Lead L&D EPAM Systems
 * anil_boppuri@epam.com
 * as part of Advanced Java TTT Program
 *  conducted by Yahor Fralou in the month of May,2017
 *  this is the fourth and final assignment
 */
public class Profitelores extends Bun {
	double weight;
	String creamType;
	String topping;
	double price;

	

	public Profitelores() {
		 this(50,"Chocolate","Cheese",5);
	}

	public Profitelores(double weight, String creamType, String topping,
			double price) {
		this.weight = weight;
		this.creamType = creamType;
		this.topping = topping;
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getCreamType() {
		return creamType;
	}

	public void setCreamType(String creamType) {
		this.creamType = creamType;
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
		return "Profitelores [weight=" + weight + ", creamType=" + creamType
				+ ", topping=" + topping + ", price=" + price + "]";
	}

}
