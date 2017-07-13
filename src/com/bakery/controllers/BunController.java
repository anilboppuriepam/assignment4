package com.bakery.controllers;

import com.bakery.factory.bun.BunWithFillingFactory;
import com.bakery.factory.bun.GingerBreadFactory;
import com.bakery.factory.bun.ProfiteloresFactory;
import com.bakery.factory.cake.AbstractBakery;
/*
 * Created by Anil Boppuri
 * Lead L&D EPAM Systems
 * anil_boppuri@epam.com
 * as part of Advanced Java TTT Program
 *  conducted by Yahor Fralou in the month of May,2017
 *  this is the fourth and final assignment
 */
public final class BunController {

	     private static AbstractBakery bunBakery;
	     
	      public  static AbstractBakery chooseBunFactory(String orderItem){
	    	  
	    	  switch(orderItem){
	    		  
	      case "BunWithFilling": {
				bunBakery = new BunWithFillingFactory();
				break;
			}
			case "GingerBread": {
				bunBakery = new GingerBreadFactory();
				break;
			}
			case "Profitelores": {
				bunBakery = new ProfiteloresFactory();
				break;
			}
			case "STOP": {
				System.exit(0);
			}
			default:{
				System.out.println(orderItem + "  is not found ");
				break;
			}
			}
	    	  return bunBakery;
	      }
}
