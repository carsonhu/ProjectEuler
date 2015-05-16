package main.classes;

import java.util.ArrayList;

import main.functions.EulerFunctions;

public class Euler108DiophantineReciprocals {
	public static void run(){
		double theNum = 0;
		for(double n = 10; n < Double.MAX_VALUE; n = n + 10){
			
			int divisors = numDivisors(n);
			if(divisors > 200){
				System.out.println(n + " " + divisors);
			}
			if(divisors > 1000){
				theNum = n;
				break;
			}
		}
		System.out.println(theNum);
	}

	public static int numDivisors(double aNumber){ //find divisors
		int count = 0;
		for(int i = 1; i <= Math.sqrt(aNumber); i++){ 
			if(aNumber / i == Math.floor(aNumber / i)){
				count++;
				if(i != aNumber / i){
				count++;
				}
			}
		}
		return count;
	}
}
