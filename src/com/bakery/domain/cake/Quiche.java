package com.bakery.domain.cake;

/*
 * Created by Anil Boppuri
 * Lead L&D EPAM Systems
 * anil_boppuri@epam.com
 * as part of Advanced Java TTT Program
 *  conducted by Yahor Fralou in the month of May,2017
 *  this is the fourth and final assignment
 */
public class Quiche extends Cake{
	
	double weight;
	String cheeseType;
	String fillingType;
	boolean isCrusted;
	double price;
	
	public Quiche() {
		 this(15.5,"Mexican","GingerGarlic",true,7);
	}

	public Quiche(double weight, String cheeseType, String fillingType,
			boolean isCrusted, double price) {
		
		this.weight = weight;
		this.cheeseType = cheeseType;
		this.fillingType = fillingType;
		this.isCrusted = isCrusted;
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getCheeseType() {
		return cheeseType;
	}

	public void setCheeseType(String cheeseType) {
		this.cheeseType = cheeseType;
	}

	public String getFillingType() {
		return fillingType;
	}

	public void setFillingType(String fillingType) {
		this.fillingType = fillingType;
	}

	public boolean isCrusted() {
		return isCrusted;
	}

	public void setCrusted(boolean isCrusted) {
		this.isCrusted = isCrusted;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Quiche [weight=" + weight + ", cheeseType=" + cheeseType
				+ ", fillingType=" + fillingType + ", isCrusted=" + isCrusted
				+ ", price=" + price + "]";
	}
	
}
