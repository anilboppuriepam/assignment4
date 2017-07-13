package com.bakery.domain.cake;

/*
 * Created by Anil Boppuri
 * Lead L&D EPAM Systems
 * anil_boppuri@epam.com
 * as part of Advanced Java TTT Program
 *  conducted by Yahor Fralou in the month of May,2017
 *  this is the fourth and final assignment
 */
public class PieWithBerries  extends Cake{

	 double weight;
	 String doughType;
	 String berryType;
	 String shape;
	 double price;
	 
	 public PieWithBerries() {
		 this(40,"Wheat","Raspberry","Square",4.5);
	}

	public PieWithBerries(double weight, String doughType, String berryType,
			String shape, double price) {
		
		this.weight = weight;
		this.doughType = doughType;
		this.berryType = berryType;
		this.shape = shape;
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

	public String getBerryType() {
		return berryType;
	}

	public void setBerryType(String berryType) {
		this.berryType = berryType;
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
		return "PieWithBerries [weight=" + weight + ", doughType=" + doughType
				+ ", berryType=" + berryType + ", shape=" + shape + ", price="
				+ price + "]";
	}
	 
	 
}
