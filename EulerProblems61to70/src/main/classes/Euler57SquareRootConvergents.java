package main.classes;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Euler57SquareRootConvergents { //requires primitive addition method to function correctly
	public static void run(){
		BigDecimal numer = new BigDecimal(3);
		BigDecimal denom = new BigDecimal(2);
		int count = 0;
		for(int i = 1; i <= 1000; i++){
			BigDecimal tempNum = numer.add(denom);
			BigDecimal tempDenom = tempNum;
			tempNum = denom;
			tempNum = tempNum.add(tempDenom);
			numer = tempNum;
			denom = tempDenom;
			
			String num = tempNum.toString();
			String den = tempDenom.toString();
			if(i >= 970){
				System.out.println(num + "/" + denom);
			}
			if(num.length() > den.length()){
				count++;
			}
		}
		System.out.println(count);
	}
	
/*	public static double f(int count){
		if(count == 0){
			return 2;
		}else{
			return 2 + 1.0 / f(count - 1);
		}
	}*/
}
