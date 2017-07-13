package com.bakery.controllers;

import com.bakery.factory.cake.AbstractBakery;
import com.bakery.factory.cake.BerlinerFactory;
import com.bakery.factory.cake.BrownieFactory;
import com.bakery.factory.cake.CheeseCakeFactory;
import com.bakery.factory.cake.CupCakeFactory;
import com.bakery.factory.cake.EclairFactory;
import com.bakery.factory.cake.GelatinChocolateDessertFactory;
import com.bakery.factory.cake.GelatinFruitDessertFactory;
import com.bakery.factory.cake.GelatinMilkDessertFactory;
import com.bakery.factory.cake.MacaronFactory;
import com.bakery.factory.cake.MousseFactory;
import com.bakery.factory.cake.PavlovaFactory;
import com.bakery.factory.cake.PieWithBerriesFactory;
import com.bakery.factory.cake.QuicheFactory;
import com.bakery.factory.cake.RugelachFactory;
import com.bakery.factory.cake.StrudelFactory;
import com.bakery.factory.cake.TiramisuFactory;
import com.bakery.factory.cake.WhoopiPieFactory;
/*
 * Created by Anil Boppuri
 * Lead L&D EPAM Systems
 * anil_boppuri@epam.com
 * as part of Advanced Java TTT Program
 *  conducted by Yahor Fralou in the month of May,2017
 *  this is the fourth and final assignment
 */
public final class CakeController {

	private static AbstractBakery cakeBakery;

	public static AbstractBakery chooseCakeFactory(String orderItem) {

		switch (orderItem) {

		case "Berliner": {
			cakeBakery = new BerlinerFactory();
			break;
		}
		case "Brownie": {
			cakeBakery = new BrownieFactory();
			break;
		}
		case "CheeseCake": {
			cakeBakery = new CheeseCakeFactory();
			break;
		}
		case "CupCake": {
			cakeBakery = new CupCakeFactory();
			break;
		}
		case "Eclair": {
			cakeBakery = new EclairFactory();
			break;
		}
		case "GelatinChocolateDessert": {
			cakeBakery = new GelatinChocolateDessertFactory();
			break;
		}
		case "GelatinFruitDessert": {
			cakeBakery = new GelatinFruitDessertFactory();
			break;
		}
		case "GelatinMilkDessert": {
			cakeBakery = new GelatinMilkDessertFactory();
			break;
		}
		case "Macaron": {
			cakeBakery = new MacaronFactory();
			break;
		}
		case "Mousse": {
			cakeBakery = new MousseFactory();
			break;
		}
		case "Pavlova": {
			cakeBakery = new PavlovaFactory();
			break;
		}
		case "PieWithBerries": {
			cakeBakery = new PieWithBerriesFactory();
			break;
		}
		case "Quiche": {
			cakeBakery = new QuicheFactory();
			break;
		}
		case "Rugelach": {
			cakeBakery = new RugelachFactory();
			break;
		}
		case "Strudel": {
			cakeBakery = new StrudelFactory();
			break;
		}
		case "Tiramisu": {
			cakeBakery = new TiramisuFactory();
			break;
		}
		case "WhoopiPie": {
			cakeBakery = new WhoopiPieFactory();
			break;
		}
		default:

			System.out.println(orderItem + "  not found");
			break;
		}

		return cakeBakery;
	}
}
