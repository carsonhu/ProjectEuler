package main.classes;

import java.util.ArrayList;

import main.functions.EulerFunctions;

public class Euler204HammingNumbers {
	public static void run(){
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for(int i = 101; i < Math.pow(10, 9); i += 2){
			if(EulerFunctions.isPrime(i)){
				primes.add(i);
			}
		}
		System.out.println(primes.size());
		
	}
}
