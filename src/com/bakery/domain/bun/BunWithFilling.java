package com.bakery.domain.bun;
/*
 * Created by Anil Boppuri
 * Lead L&D EPAM Systems
 * anil_boppuri@epam.com
 * as part of Advanced Java TTT Program
 *  conducted by Yahor Fralou in the month of May,2017
 *  this is the fourth and final assignment
 */

public class BunWithFilling extends Bun {

	double weight;
	String doughType;
	String fillingType;
	double price;

	public BunWithFilling() {
		 this(25,"Italian","Crushed Vegiies and spices",6);
	}

	public BunWithFilling(double weight, String doughType, String fillingType,
			double price) {
		this.weight = weight;
		this.doughType = doughType;
		this.fillingType = fillingType;
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getDoughType() {
		return doughType;
	}

	public void setDoughType(String doughType) {
		this.doughType = doughType;
	}

	public String getFillingType() {
		return fillingType;
	}

	public void setFillingType(String fillingType) {
		this.fillingType = fillingType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BunWithFilling [weight=" + weight + ", doughType=" + doughType
				+ ", fillingType=" + fillingType + ", price=" + price + "]";
	}

}
