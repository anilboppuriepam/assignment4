package com.bakery.domain.biscuit;

/*
 * Created by Anil Boppuri
 * Lead L&D EPAM Systems
 * anil_boppuri@epam.com
 * as part of Advanced Java TTT Program
 *  conducted by Yahor Fralou in the month of May,2017
 *  this is the fourth and final assignment
 */
public class DonoutWithFillingBerliner  extends Biscuit{

	 private String fillingtype;
	 private String typeOfTop;
	 private String cover;
	 private double weight;
	 private double price;
	 private String energyValue;
	 
	 public DonoutWithFillingBerliner() {
		 this("Chocolate Cashewnuts","Dark Black","Wafers",5,35.5,"50 Calaroies");
	}

	public DonoutWithFillingBerliner(String fillingtype, String typeOfTop,
			String cover, double weight, double price, String energyValue) {
		this.fillingtype = fillingtype;
		this.typeOfTop = typeOfTop;
		this.cover = cover;
		this.weight = weight;
		this.price = price;
		this.energyValue = energyValue;
	}

	public String getFillingtype() {
		return fillingtype;
	}

	public void setFillingtype(String fillingtype) {
		this.fillingtype = fillingtype;
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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getEnergyValue() {
		return energyValue;
	}

	public void setEnergyValue(String energyValue) {
		this.energyValue = energyValue;
	}

	@Override
	public String toString() {
		return "DonoutWithFillingBerliner [fillingtype=" + fillingtype
				+ ", typeOfTop=" + typeOfTop + ", cover=" + cover + ", weight="
				+ weight + ", price=" + price + ", energyValue=" + energyValue
				+ "]";
	}
	
	
}
