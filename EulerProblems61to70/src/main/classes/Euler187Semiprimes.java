package main.classes;

import java.util.ArrayList;

import main.functions.EulerFunctions;

public class Euler187Semiprimes {
	public static void run(){
		int count = 0;
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for(int i = 1; i < Math.pow(10, 8); i++){
			
			if(EulerFunctions.isPrime(i)){
				primes.add(i);
			}
			
		}
		for(int i = 0; i < primes.size(); i++){
			
			
			for(int j = i; j < primes.size();j++){
				if( i * j < Math.pow(10, 8))
					count++;
			}
		}
		
		System.out.println(count);
	}

	
	
	
}
