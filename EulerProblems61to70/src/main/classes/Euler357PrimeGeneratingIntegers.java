package main.classes;

import java.util.ArrayList;

import main.functions.EulerFunctions;

public class Euler357PrimeGeneratingIntegers {
	public static void run(){
		System.out.println(EulerFunctions.isPrime(5.5));
		long count = 0;
		for(int i = 2; i <= 100000000; i++){
			if(findDivisors(i) == true){
				count+= i;
			}
			if(i % 1000000 == 0){
				System.out.println(i);
			}
		}
		System.out.println(count);
	}
	
	public static boolean findDivisors(double aNumber){ //find divisors
		for(int i = 1; i <= Math.sqrt(aNumber); i++){ 
			if(aNumber / i == Math.floor(aNumber / i)){
				if(!EulerFunctions.isPrime(i + aNumber / i)){
					return false;
				}
			}
		}

		return true;
	}
	
	
}
