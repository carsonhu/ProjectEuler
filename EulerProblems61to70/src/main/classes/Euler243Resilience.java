package main.classes;
import main.functions.EulerFunctions;
import java.util.ArrayList;


//iterate through list of primes: 2, 3, 5, 7, 11, 13, etc.
//


public class Euler243Resilience {
	public static void run(){
	
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for(int i = 2; i < 1000;i++){
			if(EulerFunctions.isPrime(i)){
				primes.add(i);
			}
		}
		int currentDenom = 1;
		for(int j = 0; j < primes.size(); j++){
			int count = 0;
			currentDenom*= primes.get(j);
			for(int k : primes){
				if(currentDenom / k != currentDenom / (double) k){
					count++;
				}
				if(k >= currentDenom){
					break;
					}
				
			}
			double ratio = (double) count / (currentDenom - 1);
			if(ratio < 15499.0 / 94744){
				System.out.println(currentDenom);
			}
		}
		
		}
	}

