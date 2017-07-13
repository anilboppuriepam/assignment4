package com.bakery.factory.biscuit;

import com.bakery.domain.BakedFood;
import com.bakery.domain.biscuit.CinnamonRoll;
import com.bakery.factory.cake.AbstractBakery;

/*
 * Created by Anil Boppuri
 * Lead L&D EPAM Systems
 * anil_boppuri@epam.com
 * as part of Advanced Java TTT Program
 *  conducted by Yahor Fralou in the month of May,2017
 *  this is the fourth and final assignment
 */

public class CinnamonRollFactory implements AbstractBakery {

	AbstractBakery bakery;

	@Override
	public BakedFood bake() {

				return new CinnamonRoll();
	}

}
