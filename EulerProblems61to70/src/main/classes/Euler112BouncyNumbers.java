package main.classes;

import main.functions.EulerFunctions;

public class Euler112BouncyNumbers {
	public static void run(){
		double proportion = 0;
	//	int i = 0;
		double totcount = 0;
		double bouncycount = 0;
		int count = 0;
		int intcount = 0;
		for(int j = 0; j < 1587099; j++){
			if(!EulerFunctions.isIncreasing(j) && !EulerFunctions.isDecreasing(j))
				count++;
			intcount = j + 1;
		}
		System.out.println(count);
		System.out.println((double)count / intcount);
		for(double j = 0; j < 1999999999; j++){
			if(!EulerFunctions.isIncreasing((int)j) && !EulerFunctions.isDecreasing((int)j)){
				bouncycount++;
			}
			
			proportion = (double) bouncycount /(j);
			totcount = j;
			if(proportion >=.99){
				j = 2099999999;
			}
		}
		System.out.println(totcount);
		System.out.println(proportion);
	}
}
