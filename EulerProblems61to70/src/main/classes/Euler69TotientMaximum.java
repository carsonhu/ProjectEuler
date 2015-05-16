package main.classes;

import java.util.ArrayList;

import main.functions.EulerFunctions;

public class Euler69TotientMaximum {

	public static void run(){
		int maxSize = 0;
		int theR = 0;
		int aPhi = 0;
	for(int r = 1; r < 1000000; r++){
		ArrayList<Integer> divisors = EulerFunctions.findDivisors(r);
		ArrayList<Integer> primeDivisors = new ArrayList<Integer>();
		for(int i : divisors){
			if(EulerFunctions.isPrime(i) && !primeDivisors.contains(i)){
				primeDivisors.add(i);
			}
		}
		int theSize = primeDivisors.size();
		if(theSize > 6){
			System.out.println("Size " + theSize);
			System.out.println("R " + r);
			//System.out.println(aPhi);
		}
	}

		double maximum = 1;
		int theN = 0;
		int thePhi = 0;
		for(int n = 2; n <= 1000000; n++){
			double u = (double) n / phi(n);
			if(u >= maximum){
				maximum = u;
				theN = n;
				thePhi = phi(n);
			}
		}
		System.out.println(maximum);
		System.out.println(theN);
		System.out.println(thePhi);
	}
	public static int phi(int n){
		ArrayList<Integer> divisors = EulerFunctions.findDivisors(n);
		ArrayList<Integer> primeDivisors = new ArrayList<Integer>();
		for(int i : divisors){
			if(EulerFunctions.isPrime(i) && !primeDivisors.contains(i)){
				
				primeDivisors.add(i);
			}
		}
		int finalCount = n-1;
		for(int p = 0; p < primeDivisors.size(); p++){
			finalCount -= (n-1) / primeDivisors.get(p);
		}
		
			for(int g = 1; g < primeDivisors.size(); g++){ //size o factors
				int tinySum = 1;
				for(int p = 0; p + g - 1 < primeDivisors.size(); p++){
					tinySum = tinySum * primeDivisors.get(p);
				}
				if(g == 1){
				finalCount+= (n-1) / tinySum;
				}else{
					finalCount -= (n-1) / tinySum;
				}
			}
		
		return finalCount;
		
	}
}
