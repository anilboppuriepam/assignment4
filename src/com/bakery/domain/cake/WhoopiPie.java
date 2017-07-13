package com.bakery.domain.cake;
/*
 * Created by Anil Boppuri
 * Lead L&D EPAM Systems
 * anil_boppuri@epam.com
 * as part of Advanced Java TTT Program
 *  conducted by Yahor Fralou in the month of May,2017
 *  this is the fourth and final assignment
 */

public class WhoopiPie extends Cake {
	double weight;
	
	String cookieType;
	String creamFillingType;
	String cookieColor;
	String fillingColor;
	double price;
	
	public WhoopiPie() {
		 this(30,"Coconut","Strawberry","Brown","Choclate brown",20);
	}

	public WhoopiPie(double weight, String cookieType, String creamFillingType,
			String cookieColor, String fillingColor, double price) {
		
		this.weight = weight;
		this.cookieType = cookieType;
		this.creamFillingType = creamFillingType;
		this.cookieColor = cookieColor;
		this.fillingColor = fillingColor;
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getCookieType() {
		return cookieType;
	}

	public void setCookieType(String cookieType) {
		this.cookieType = cookieType;
	}

	public String getCreamFillingType() {
		return creamFillingType;
	}

	public void setCreamFillingType(String creamFillingType) {
		this.creamFillingType = creamFillingType;
	}

	public String getCookieColor() {
		return cookieColor;
	}

	public void setCookieColor(String cookieColor) {
		this.cookieColor = cookieColor;
	}

	public String getFillingColor() {
		return fillingColor;
	}

	public void setFillingColor(String fillingColor) {
		this.fillingColor = fillingColor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "WhoopiPie [weight=" + weight + ", cookieType=" + cookieType
				+ ", creamFillingType=" + creamFillingType + ", cookieColor="
				+ cookieColor + ", fillingColor=" + fillingColor + ", price="
				+ price + "]";
	}
	
	
}
