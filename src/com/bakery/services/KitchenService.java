package com.bakery.services;
import com.bakery.factory.cake.AbstractBakery;
/*
 * Created by Anil Boppuri
 * Lead L&D EPAM Systems
 * anil_boppuri@epam.com
 * as part of Advanced Java TTT Program
 *  conducted by Yahor Fralou in the month of May,2017
 *  this is the fourth and final assignment
 */

public class KitchenService {

	static AbstractBakery factory;
	
	static  public void order(AbstractBakery newFactory){
		 
		  factory = newFactory;
		 System.out.println(factory.bake());
	 }
}
