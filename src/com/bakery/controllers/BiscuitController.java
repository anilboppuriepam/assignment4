package com.bakery.controllers;

/*
 * Created by Anil Boppuri
 * Lead L&D EPAM Systems
 * anil_boppuri@epam.com
 * as part of Advanced Java TTT Program
 *  conducted by Yahor Fralou in the month of May,2017
 *  this is the fourth and final assignmimport java.lang.annotation.Documented;

ent
 */
import com.bakery.factory.biscuit.BelgianWafflesFactory;
import com.bakery.factory.biscuit.CandiedFruitFactory;
import com.bakery.factory.biscuit.CinnamonRollFactory;
import com.bakery.factory.biscuit.CroissantFactory;
import com.bakery.factory.biscuit.DonutFactory;
import com.bakery.factory.biscuit.DonutWithFillingBerlinerFactory;
import com.bakery.factory.biscuit.MeringuesFactory;
import com.bakery.factory.biscuit.SandwichCookieFactory;
import com.bakery.factory.cake.AbstractBakery;

public final class BiscuitController {

	private static AbstractBakery biscuitBakery;

	public static AbstractBakery chooseBiscuitFactory(String orderItem) {

		switch (orderItem) {

		case "BelgianWaffles": {
			biscuitBakery = new BelgianWafflesFactory();
			break;
		}
		case "CandiedFruit": {
			biscuitBakery = new CandiedFruitFactory();
			break;
		}
		case "CinnamonRoll": {
			biscuitBakery = new CinnamonRollFactory();
			break;
		}
		case "Croissant": {
			biscuitBakery = new CroissantFactory();
			break;
		}
		case "Donut": {
			biscuitBakery = new DonutFactory();
			break;
		}
		case "DonutWithFillingBerliner": {
			biscuitBakery = new DonutWithFillingBerlinerFactory();
			break;
		}
		case "Meringues": {
			biscuitBakery = new MeringuesFactory();
			break;
		}
		case "SandwichCookie": {
			biscuitBakery = new SandwichCookieFactory();
			break;
		}
		default: {
			System.out.println(orderItem + " is not found ");
			break;
		}
		}
		return biscuitBakery;
	}

}
