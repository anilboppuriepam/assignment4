package com.bakery.domain.cake;

/*
 * Created by Anil Boppuri
 * Lead L&D EPAM Systems
 * anil_boppuri@epam.com
 * as part of Advanced Java TTT Program
 *  conducted by Yahor Fralou in the month of May,2017
 *  this is the fourth and final assignment
 */

public class Rugelach extends  Cake{

	private double weight;
	private String fillingType;
	private String doughType;
	private boolean isOriginalFilling;
	private double price;
	
	public Rugelach() {
		 this(10,"FreshVegetables","Wheat",true,11);
	}

	public Rugelach(double weight, String fillingType, String doughType,
			boolean isOriginalFilling, double price) {
		
		this.weight = weight;
		this.fillingType = fillingType;
		this.doughType = doughType;
		this.isOriginalFilling = isOriginalFilling;
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

	public boolean isOriginalFilling() {
		return isOriginalFilling;
	}

	public void setOriginalFilling(boolean isOriginalFilling) {
		this.isOriginalFilling = isOriginalFilling;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Rugelach [weight=" + weight + ", fillingType=" + fillingType
				+ ", doughType=" + doughType + ", isOriginalFilling="
				+ isOriginalFilling + ", price=" + price + "]";
	}
	
	
}
