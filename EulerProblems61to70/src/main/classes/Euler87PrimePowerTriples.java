package main.classes;

import java.util.ArrayList;

import main.functions.EulerFunctions;

public class Euler87PrimePowerTriples {
	public static void run(){
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for(int i = 1; i < 8000; i++){
			if(EulerFunctions.isPrime(i)){
				primes.add(i);
			}
		}
		System.out.println("Phase 1 complete");
		ArrayList<Integer> theNumbers = new ArrayList<Integer>();
		for(int k = 0; k < primes.size(); k++){
			System.out.println(k);
			if(Math.pow(primes.get(k), 4) > 50000000){
				break;
			}
			for(int j = 0; j < primes.size(); j++){
				if(Math.pow(primes.get(j), 3) + Math.pow(primes.get(k), 4 )> 50000000){
					break;
				}
				for(int i = 0; i < primes.size(); i++){
				
					int n = (int)Math.pow(primes.get(i), 2) + (int)Math.pow(primes.get(j),3) + (int)Math.pow(primes.get(k),4);
					if(n < 50000000){
					if(!theNumbers.contains(n)){
						theNumbers.add(n);
					}
					}else{
						break;
					}
				}
			}
		}
		System.out.println(theNumbers.size());
		
	}
}
