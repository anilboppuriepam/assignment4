package com.bakery.factory.bun;

import com.bakery.domain.BakedFood;
import com.bakery.domain.bun.Profitelores;
import com.bakery.factory.cake.AbstractBakery;

/*
 * Created by Anil Boppuri
 * Lead L&D EPAM Systems
 * anil_boppuri@epam.com
 * as part of Advanced Java TTT Program
 *  conducted by Yahor Fralou in the month of May,2017
 *  this is the fourth and final assignment
 */

public class ProfiteloresFactory implements AbstractBakery {

	@Override
	public BakedFood bake() {
	
		return new Profitelores();
	}

	
}
