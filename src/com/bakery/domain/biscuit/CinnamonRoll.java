package com.bakery.domain.biscuit;
/*
 * Created by Anil Boppuri
 * Lead L&D EPAM Systems
 * anil_boppuri@epam.com
 * as part of Advanced Java TTT Program
 *  conducted by Yahor Fralou in the month of May,2017
 *  this is the fourth and final assignment
 */

public class CinnamonRoll extends Biscuit {

	    private double weight;
	    private String doughType;
	    private String cinnamon;
	    private String amount;
	    private String garnish;
	    private double price;
	    
	    public CinnamonRoll() {
	    	 this(30,"Mexican", "Black","Half","Medium",6);
		}

		public CinnamonRoll(double weight, String doughType, String cinnamon,
				String amount, String garnish, double price) {
				this.weight = weight;
			this.doughType = doughType;
			this.cinnamon = cinnamon;
			this.amount = amount;
			this.garnish = garnish;
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

		public String getCinnamon() {
			return cinnamon;
		}

		public void setCinnamon(String cinnamon) {
			this.cinnamon = cinnamon;
		}

		public String getAmount() {
			return amount;
		}

		public void setAmount(String amount) {
			this.amount = amount;
		}

		public String getGarnish() {
			return garnish;
		}

		public void setGarnish(String garnish) {
			this.garnish = garnish;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "CinnamonRoll [weight=" + weight + ", doughType="
					+ doughType + ", cinnamon=" + cinnamon + ", amount="
					+ amount + ", garnish=" + garnish + ", price=" + price
					+ "]";
		}
	
		
	
}
