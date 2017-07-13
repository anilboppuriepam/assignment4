package com.bakery.domain.cake;
/*
 * Created by Anil Boppuri
 * Lead L&D EPAM Systems
 * anil_boppuri@epam.com
 * as part of Advanced Java TTT Program
 *  conducted by Yahor Fralou in the month of May,2017
 *  this is the fourth and final assignment
 */

public class GelatinChocolateDessert  extends Cake{

	double weight;
	String chocolateType;
	double amountOfSugar;
	double fatContent;
	double price;
	
	public GelatinChocolateDessert() {
		 this(45.5,"BlackForestChocolate",5,3,100);
	}

	public GelatinChocolateDessert(double weight, String chocolateType,
			double amountOfSugar, double fatContent, double price) {
		
		this.weight = weight;
		this.chocolateType = chocolateType;
		this.amountOfSugar = amountOfSugar;
		this.fatContent = fatContent;
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getChocolateType() {
		return chocolateType;
	}

	public void setChocolateType(String chocolateType) {
		this.chocolateType = chocolateType;
	}

	public double getAmountOfSugar() {
		return amountOfSugar;
	}

	public void setAmountOfSugar(double amountOfSugar) {
		this.amountOfSugar = amountOfSugar;
	}

	public double getFatContent() {
		return fatContent;
	}

	public void setFatContent(double fatContent) {
		this.fatContent = fatContent;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "GelatinChocolateDessert [weight=" + weight + ", chocolateType="
				+ chocolateType + ", amountOfSugar=" + amountOfSugar
				+ ", fatContent=" + fatContent + ", price=" + price + "]";
	}
	
	
}
