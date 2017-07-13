package com.bakery.domain.cake;
/*
 * Created by Anil Boppuri
 * Lead L&D EPAM Systems
 * anil_boppuri@epam.com
 * as part of Advanced Java TTT Program
 *  conducted by Yahor Fralou in the month of May,2017
 *  this is the fourth and final assignment
 */
public class Eclair  extends Cake{

	private double weight;
	 private String fillingType;
	 private String typeOfTop;
	 private String cover;
	 private double price;

 public Eclair() {
	 this(40.5,"Chocolate","Dark Black","Wafer",60);
}

public Eclair(double weight, String fillingType, String typeOfTop,
		String cover, double price) {
	
	this.weight = weight;
	this.fillingType = fillingType;
	this.typeOfTop = typeOfTop;
	this.cover = cover;
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

public String getTypeOfTop() {
	return typeOfTop;
}

public void setTypeOfTop(String typeOfTop) {
	this.typeOfTop = typeOfTop;
}

public String getCover() {
	return cover;
}

public void setCover(String cover) {
	this.cover = cover;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

@Override
public String toString() {
	return "Eclair [weight=" + weight + ", fillingType=" + fillingType
			+ ", typeOfTop=" + typeOfTop + ", cover=" + cover + ", price="
			+ price + "]";
}
 
 
}


