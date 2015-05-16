package main.classes;

import java.util.ArrayList;

import main.functions.EulerFunctions;
import main.functions.Sort;

public class Euler124OrderedRadicals {
	public static void run(){
		ArrayList<Integer> productify = new ArrayList<Integer>();
		for(int r = 1; r < 100000; r++){
			ArrayList<Integer> divisors = EulerFunctions.findDivisors(r);
			ArrayList<Integer> primeDivisors = new ArrayList<Integer>();
			for(int i : divisors){
				if(EulerFunctions.isPrime(i) && !primeDivisors.contains(i)){
					primeDivisors.add(i);
				}
			}
			int product = 1;
			for(int i : primeDivisors){
				product *= i;
			}
			productify.add(product);
			if(product == 1947){
				System.out.println(r);
			}
		}
		Sort<Integer> sorter = new Sort<Integer>();
		productify = sorter.sort(productify);
		for(int i = 0; i < 10; i++){
		System.out.println(productify.get(i));
		}
	}
}
