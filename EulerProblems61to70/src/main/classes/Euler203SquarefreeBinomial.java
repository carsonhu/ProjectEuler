package main.classes;

import java.util.ArrayList;
import java.util.List;

import main.functions.EulerFunctions;

public class Euler203SquarefreeBinomial {
	public static void run(){
		ArrayList<long[]> pascals = EulerFunctions.pascal();
		ArrayList<Long> numbers = new ArrayList<Long>();
		for(long[] a : pascals){
			for(long b : a){
				//System.out.print(b + " ");
				if(!numbers.contains(b)){
					numbers.add(b);
					//if(b % 2 != 0){
					//System.out.println(b + " ");
					//}
				}
			}
			System.out.println();
		}
		
		ArrayList<Long> newNums = new ArrayList<Long>();
		
		for(long num : numbers){
			/*if(num % 2 == 0){
				if(num % 4 != 0){
					newNums.add(num);
					System.out.println(num);
				}
			}else{*/
				
				boolean squarefree = false;
				List<Long> factors = EulerFunctions.slightlyEfficientFactorization(num);
				for(int i = 0; i < factors.size() - 1; i++){
					long theNum = factors.get(i);
					for(int j = i + 1; j < factors.size(); j++){
						long checkNum = factors.get(j);
						if(checkNum == theNum){
							squarefree = true;
							j = factors.size();
							i = factors.size() - 1;
						}
					}
				}
				if(squarefree == false){
					newNums.add(num);
					
				}else{
			//		System.out.println(num);
				}
			
			
			
		}
		long sum = 0;
		for(long a : newNums){
			sum+= a;
		//	System.out.println(a);
		}
		System.out.println(sum);
		
	}
	
}
