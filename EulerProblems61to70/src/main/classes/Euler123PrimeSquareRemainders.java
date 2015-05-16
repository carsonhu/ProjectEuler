package main.classes;

import java.util.ArrayList;

import main.functions.EulerFunctions;

public class Euler123PrimeSquareRemainders {
	public static void run(){
		ArrayList<Long> primes = new ArrayList<Long>();
		primes.add((long) 0);
		for(long i = 2; i < 10000000; i++){
			if(EulerFunctions.isPrime(i)){
				primes.add(i);
			}
		}
		
		for(long b = 1; b <= primes.size(); b++){
			long a = primes.get((int)b);
			
			long rMax = 0;
			
			long origA = a - 1;
			long origB = a + 1;
			long aa = origA;
			long bb = origB;
			long denom = (long) Math.pow(a, 2);
			for(int i = 1; i < b; i++){
				aa = aa * origA;
				bb = bb * origB;
				aa = aa % denom;
				bb = bb % denom;
			}
			long answer = (aa + bb) % denom;
			if(answer > rMax){
				rMax = answer;
			}
			System.out.println(b + " " + answer); 
			if(rMax > Math.pow(10, 10)){
				System.out.println(rMax);
				break;
			}
		}
		}
}
