package main.classes;

import java.math.BigDecimal;

public class Euler100ArrangedProbability {
	public static void run(){
		//CHEESE MASTER RACE. A shit ton of math was used. actually it was more like limits and cheese in the end. Got the list of all the values,found that they fit quite nicely into a curve.
		long k = 4;
		while(k < Math.pow(10, 12)){
			double u = (double) k * (3 + 2 * Math.sqrt(2));
			k = (long) Math.floor(u - 2);
			System.out.println(k);
		}
		long arr = (long) (Math.sqrt(2 * (Math.pow(k, 2) - k) + 1) + 1) / 2;
		
		System.out.println(arr);
	}
}
