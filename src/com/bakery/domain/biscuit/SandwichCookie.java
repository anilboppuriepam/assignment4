package com.bakery.domain.biscuit;
/*
 * Created by Anil Boppuri
 * Lead L&D EPAM Systems
 * anil_boppuri@epam.com
 * as part of Advanced Java TTT Program
 *  conducted by Yahor Fralou in the month of May,2017
 *  this is the fourth and final assignment
 */

public class SandwichCookie extends Biscuit{

	private double weight;
	private String fillingType;
	private String doughType;
	private String shape;
	private double price;
	
	public SandwichCookie() {
		 this(15.5,"Green Mint Salad","Mexican","Diamond",10);
	}
	

	public SandwichCookie(double weight, String fillingType, String doughType,
			String shape, double price) {
		this.weight = weight;
		this.fillingType = fillingType;
		this.doughType = doughType;
		this.shape = shape;
		this.price = price;
	}



	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getFillingType() {
		return fillingType;
	}

	public void setFillingType(String fillingType) {
		this.fillingType = fillingType;
	}

	
	
	public String getDoughType() {
		return doughType;
	}


	public void setDoughType(String doughType) {
		this.doughType = doughType;
	}


	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "SandwichCookie [weight=" + weight + ", fillingType="
				+ fillingType + ", shape=" + shape + ", price=" + price + "]";
	}
	
	
}
