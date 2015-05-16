package main.classes;

import main.functions.EulerFunctions;

public class Euler145ReversibleNumbers {
	public static void run(){
		int count = 0;
	//	System.out.println(hasOddDigits(5445));
	for(long i = 1; i < Math.pow(10, 9); i++){
	if( i % 10 != 0){
		long reversed = EulerFunctions.reverseDigits(i);
			long sum = i + reversed;
			if(hasOddDigits(sum)){
				count++;
			}
		}
	if(i % 1000000 == 0){
		System.out.println(i);
	}
}
System.out.println(count);
	}
	public static boolean hasOddDigits(long n){
		long tempN = n;
		while(tempN > 0){
			long checker = tempN % 10;
			if(checker % 2 == 0){
				return false;
			}
			tempN /= 10;
		}
		return true;
	}
	
}
