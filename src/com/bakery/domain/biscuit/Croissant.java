package com.bakery.domain.biscuit;

/*
 * Created by Anil Boppuri
 * Lead L&D EPAM Systems
 * anil_boppuri@epam.com
 * as part of Advanced Java TTT Program
 *  conducted by Yahor Fralou in the month of May,2017
 *  this is the fourth and final assignment
 */
public class Croissant extends Biscuit {
	private double weight;
    private int size;
    private String fillingType;
    private double price;
    
    public Croissant() {
    	 this(15.5,10,"Chocolate Almonds and Nuts Dark Black",20);
	}

	public Croissant(double weight, int size, String fillingType, double price) {
		this.weight = weight;
		this.size = size;
		this.fillingType = fillingType;
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
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
		return "Croissant [weight=" + weight + ", size=" + size
				+ ", fillingType=" + fillingType + ", price=" + price + "]";
	}
    
    
}
