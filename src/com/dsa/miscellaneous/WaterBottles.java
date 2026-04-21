package com.dsa.miscellaneous;

public class WaterBottles {

	public static void main(String[] args) {
		System.out.println(numWaterBottles(9, 3));

	}

	public static int numWaterBottles(int numBottles, int numExchange) {
		int x = numBottles;
		int y = 0;
		int drink = numBottles;
		while (x >= numExchange) {
			drink = drink + x / numExchange;
			y = x % numExchange;
			x = x / numExchange + y;
		}
		return drink;
	}
}
