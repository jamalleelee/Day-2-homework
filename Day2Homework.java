package com.day2homework;

import java.util.Arrays;

public class Day2Homework {

	public static void main(String[] args) {
		String hi = "Hello World";
		int numba = 1492;
		boolean youHasDog = true;
		String todaysDate = "8-2-2016";
		double moneyMoney = 5.45;
		char oneThirdVinDiesel = 'x';

		System.out.println(hi);
		System.out.println("Columbus Sailed the world in " + numba);
		System.out.println("It is " + youHasDog + " that I have a dog at home");
		System.out.println("Today is " + todaysDate);
		System.out.println("I spent $" + moneyMoney + " on a cheeseburger.");
		System.out.println(oneThirdVinDiesel + " marks the spot");

		String[] mahFavMovingPics = { "Boondock Saints", "Space Jam", "The Terminator", "Avengers", "Baa-man",
				"Pider-man", "Ant-man", "Ironman", "The Shining", "The Fountain" };

		String[] mahFavMusicMakers = { "Musiq Soulchild", "Disturbed", "Deff Not Drake", "Adele", "Akira Jimbo",
				"Alessia Cara", "Aloe Blacc", "Anathallo", "Bond", "Bruno Mars" };

		String[][] mahFavTings = new String[4][6];
		// 0=fav foods 1=fav albums 2= books 3= movies
		mahFavTings[0][0] = "Pizza";
		mahFavTings[0][1] = "General Tso";
		mahFavTings[0][2] = "Eggs";
		mahFavTings[0][3] = "Clif Bars";
		mahFavTings[0][4] = "Apples";
		mahFavTings[0][5] = "Cherries";
		mahFavTings[1][0] = "Thriller";
		mahFavTings[1][1] = "Take Care";
		mahFavTings[1][2] = "Anti";
		mahFavTings[1][3] = "25";
		mahFavTings[1][4] = "Planet Rock";
		mahFavTings[1][5] = "Four Colors";
		mahFavTings[2][0] = "It";
		mahFavTings[2][1] = "The Stand";
		mahFavTings[2][2] = "Cat in the Hat";
		mahFavTings[2][3] = "1 Fish 2 Fish";
		mahFavTings[2][4] = "Java for Dummies";
		mahFavTings[2][5] = "Coloring with Numbers";
		mahFavTings[3][0] = "Harry Potter";
		mahFavTings[3][1] = "Forest Gump";
		mahFavTings[3][2] = "Iron Man";
		mahFavTings[3][3] = "Ant Man";
		mahFavTings[3][4] = "Pider Man";
		mahFavTings[3][5] = "Ba-Man";

		System.out.println(Arrays.toString(mahFavMovingPics));
		System.out.println(Arrays.toString(mahFavMusicMakers));
		System.out.println(Arrays.deepToString(mahFavTings));

	}

	private int immaMethod(int methodNumber) {
		return 5;
	}

	public void meToo() {
		System.out.println("Hiya!");
	}

	protected char countMeIn(char randomLetter) {
		return 'c';
	}

	protected double hiYo(double amountOfMoney) {
		return 5;
	}

	public float ummmHmmm(float rootBeer) {
		return 13;

	}

	private String tskTsk(int hoursToComplete) {
		return "Shame Shame";
	}

	private int nameOfMethod(String nameOfPersonToConvertToLetters) {
		return 24;
	}

	public double imRunning() {
		return 3.1415;
	}

	protected String outOf(char yOrN) {
		return "Fatal error..JK";
	}

	protected char namesToUse(int yourLuckyNumber) {
		return 'y';
	}

}
