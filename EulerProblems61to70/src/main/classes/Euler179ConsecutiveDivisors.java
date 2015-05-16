package main.classes;

import main.functions.EulerFunctions;

public class Euler179ConsecutiveDivisors {
	public static void run(){
		int count = 0;
		System.out.println(EulerFunctions.numDivisors(49));
		for(int i = 2; i < Math.pow(10, 7); i++){
			if(EulerFunctions.numDivisors(i) == EulerFunctions.numDivisors(i + 1)){
				count++;
			}
			if(i % 10000 == 0){
			System.out.println(i);
			}
		}
		System.out.println(count);
	}
}
