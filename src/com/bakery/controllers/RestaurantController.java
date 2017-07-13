package com.bakery.controllers;

import java.util.Scanner;

import com.bakery.factory.cake.*;
import com.bakery.services.KitchenService;
/*
 * Created by Anil Boppuri
 * Lead L&D EPAM Systems
 * anil_boppuri@epam.com
 * as part of Advanced Java TTT Program
 *  conducted by Yahor Fralou in the month of May,2017
 *  this is the fourth and final assignment.
 *  
 *  The RestaurantController is the entry point for the application
 */
final public class RestaurantController {
	private static final String CAKE = "Cake";
	private static final String BISCUIT = "Biscuit";
	private static final String BUN = "Bun";
	private static final String END_TRANSACTION = "STOP";

	public static void main(String[] args) {
		openRestaurant();
	}

	public static void openRestaurant() {

		AbstractBakery bakery = null;
		String foodType = null;
		String orderdItem = null;

		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome to Food Store! ");
		while (!userInput.equals(END_TRANSACTION)) {

			System.out
					.println("Enter your food choice Cake, Biscuit and Bun, Enter Stop to exit! TQ ");
			foodType = userInput.nextLine();
			if (!(foodType.equals("Cake") || foodType.equals("Biscuit")
					|| foodType.equals("Bun")) && !foodType.equals("STOP") ) {
				continue;
			} else {
				switch (foodType) {

				case CAKE: {
					MenuController.displayCakeMenu();
					System.out.println("Enter your choice cake...");
					orderdItem = userInput.nextLine();
					bakery = CakeController.chooseCakeFactory(orderdItem);
					KitchenService.order(bakery);
					break;
				}
				case BISCUIT: {
					MenuController.displayBiscuitMenu();
					System.out.println("Enter your choice biscuit...");
					orderdItem = userInput.nextLine();
					bakery = BiscuitController.chooseBiscuitFactory(orderdItem);
					KitchenService.order(bakery);
					break;
				}
				case BUN: {
					MenuController.displayBunMenu();
					System.out.println("Enter your choice bun...");
					orderdItem = userInput.nextLine();
					bakery = BunController.chooseBunFactory(orderdItem);
					KitchenService.order(bakery);
					break;
				}
				case END_TRANSACTION: {
					System.out.println("Thanks for using our services....");
					System.exit(0);
				}
				default: {

					System.out.println("Input mismatch, Try again.....");
				}

				}

			}

		}
		userInput.close();
	}

}
