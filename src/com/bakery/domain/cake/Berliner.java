package com.bakery.domain.cake;
/*
 * Created by Anil Boppuri
 * Lead L&D EPAM Systems
 * anil_boppuri@epam.com
 * as part of Advanced Java TTT Program
 *  conducted by Yahor Fralou in the month of May,2017
 *  this is the fourth and final assignment
 */
public class Berliner extends Cake {

	private double weight;
	 private String fillingType;
	 private String glaze;
	 private double price;
	 
	 public Berliner() {
	         this(2.5,"Honey","Medium",25.5);
	}

	public Berliner(double weight, String fillingType, String glaze,
			double price) {
		
		this.weight = weight;
		this.fillingType = fillingType;
		this.glaze = glaze;
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

	public String getGlaze() {
		return glaze;
	}

	public void setGlaze(String glaze) {
		this.glaze = glaze;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Berliner [weight=" + weight + ", fillingType=" + fillingType
				+ ", glaze=" + glaze + ", price=" + price + "]";
	}
	 
}
