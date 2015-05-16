package main.classes;

import java.util.ArrayList;

import main.functions.EulerFunctions;

public class Euler20FactorialDigitSum {
	public static void run(){
		double product = 1.0;
		for(int i = 100; i >= 1; i--){
			product *= i;
			if(product > 100){
				product /= 100;
			}
		}
		System.out.println(product);
	}
}
