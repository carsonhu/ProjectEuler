package main.classes;

import java.util.ArrayList;
import main.functions.*;
public class Euler125PalindromicSums {
	public static void run(){
		int limit = 100000000;
		
		
		ArrayList<Long> squares = new ArrayList<Long>();
		ArrayList<Long> palSquares = new ArrayList<Long>();
		
		for(int i = 1; i < 10000; i++){
			squares.add((long) i * i);
		}
		
		for(int length = 2; length < squares.size() - 2; length++){
			for(long i = 0; i < squares.size() - 3; i++){
				long sum = 0;
				long j = i;
				while(j < i + length){
					sum += squares.get((int) j);
					j++;
				}
				if(sum >= limit){
					i = squares.size();
				}
				
				if(EulerFunctions.isPalindromic(sum) && sum < limit){
					System.out.println(length + " " + (i + 1) + " " + j + " " + sum);
					palSquares.add(sum);
					
				}
			}
		}
		long finalSum = 0;
		
		Sort sorter = new Sort();
		palSquares = sorter.sort(palSquares);
		for(long i: palSquares){
			//	System.out.println(i);
				finalSum += i;
			}
		System.out.println(finalSum);
		
	}
}
