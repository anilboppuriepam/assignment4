package com.bakery.factory.cake;

import com.bakery.domain.BakedFood;
import com.bakery.domain.cake.Mousse;

/*
 * Created by Anil Boppuri
 * Lead L&D EPAM Systems
 * anil_boppuri@epam.com
 * as part of Advanced Java TTT Program
 *  conducted by Yahor Fralou in the month of May,2017
 *  this is the fourth and final assignment
 */

public class MousseFactory implements AbstractBakery {

	@Override
	public BakedFood bake() {

				  return new Mousse(); 
	}

}
