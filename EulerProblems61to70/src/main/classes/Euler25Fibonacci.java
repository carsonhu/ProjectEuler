package main.classes;

import java.math.BigInteger;

public class Euler25Fibonacci {
	static int n = 2;
	
	public static void run(){
		fibonacci(BigInteger.ONE, BigInteger.ONE);
	}
	
	public static void fibonacci(BigInteger int1, BigInteger int2){
		BigInteger int3 = int1.add(int2);
		String theInt = int3.toString();
		n++;
		if(theInt.length() >= 1000){
			System.out.println(n);
		}else{
			fibonacci(int2, int3);
		}
	}
	
}
