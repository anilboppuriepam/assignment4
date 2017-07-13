package com.bakery.domain.biscuit;

/*
 * Created by Anil Boppuri
 * Lead L&D EPAM Systems
 * anil_boppuri@epam.com
 * as part of Advanced Java TTT Program
 *  conducted by Yahor Fralou in the month of May,2017
 *  this is the fourth and final assignment
 */
public class BelgianWaffles extends Biscuit {

	private double weight;
	private String fillingtype;
	private String energyValue;
	private String topping;
	private double price;

	public BelgianWaffles() {
		 this(15.5,"Almonds Cashewnuts and Vegies","100 Calaroies","Honey",7);
	}

	public BelgianWaffles(double weight, String fillingtype,
			String energyValue, String topping, double price) {
		this.weight = weight;
		this.fillingtype = fillingtype;
		this.energyValue = energyValue;
		this.topping = topping;
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getFillingtype() {
		return fillingtype;
	}

	public void setFillingtype(String fillingtype) {
		this.fillingtype = fillingtype;
	}

	public String getEnergyValue() {
		return energyValue;
	}

	public void setEnergyValue(String energyValue) {
		this.energyValue = energyValue;
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
		return "BelgianWaffles [weight=" + weight + ", fillingtype="
				+ fillingtype + ", energyValue=" + energyValue + ", topping="
				+ topping + ", price=" + price + "]";
	}
	
	
}
