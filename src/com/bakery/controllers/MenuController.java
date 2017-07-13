package com.bakery.controllers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*
 * Created by Anil Boppuri
 * Lead L&D EPAM Systems
 * anil_boppuri@epam.com
 * as part of Advanced Java TTT Program
 *  conducted by Yahor Fralou in the month of May,2017
 *  this is the fourth and final assignment
 */

public class MenuController {
	// file path is hard coded, when the file path changes, change the following path
	private static String FILE_PATH = "D:\\jungle\\core\\TTTAnilAsgnFour\\src\\";

	// file name is hard coded for test run in the following methods

	public static void displayCakeMenu() {

		readFromFile("CakeMenu.txt");

	}

	public static void displayBiscuitMenu() {

		readFromFile("BiscuitMenu.txt");
	}

	public static void displayBunMenu() {

		readFromFile("BunMenu.txt");
	}

	private static void readFromFile(String fileName) {
		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new FileReader(FILE_PATH+fileName));
			String dataLine = reader.readLine();
			while (dataLine != null) {
				String cakes[] = dataLine.split(",");
				for (String cake : cakes) {

					System.out.println(cake);
				}
				dataLine = reader.readLine();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {

			if (reader != null)
				try {
					reader.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
		}
           return;
	}
}
