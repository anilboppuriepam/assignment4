package com.bakery.domain.bun;

/*
 * Created by Anil Boppuri
 * Lead L&D EPAM Systems
 * anil_boppuri@epam.com
 * as part of Advanced Java TTT Program
 *  conducted by Yahor Fralou in the month of May,2017
 *  this is the fourth and final assignment
 */
public class GingerBread extends Bun{

	private String sweetnessBase;
	private String fillingType;
	private String glaze;
	private String softness;
	private double price;
	
	
	
	public GingerBread() {
		 this("Honey","Cashewnuts","Dark Black","Medium",9);
	}

	public GingerBread(String sweetnessBase, String fillingType, String glaze,
			String softness, double price) {
		this.sweetnessBase = sweetnessBase;
		this.fillingType = fillingType;
		this.glaze = glaze;
		this.softness = softness;
		this.price = price;
	}

	public String getSweetnessBase() {
		return sweetnessBase;
	}

	public void setSweetnessBase(String sweetnessBase) {
		this.sweetnessBase = sweetnessBase;
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

	public String getSoftness() {
		return softness;
	}

	public void setSoftness(String softness) {
		this.softness = softness;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "GingerBread [sweetnessBase=" + sweetnessBase + ", fillingType="
				+ fillingType + ", glaze=" + glaze + ", softness=" + softness
				+ ", price=" + price + "]";
	}

	
	
}
