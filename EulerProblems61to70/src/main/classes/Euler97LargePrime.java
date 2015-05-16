package main.classes;

public class Euler97LargePrime {
	public static void run(){
		long aSum = lastTenDigits(7830457);
		aSum *= 28433;
		aSum++;
		aSum %= 10000000000.0;
		System.out.println(aSum);
	}
	
	public static long lastTenDigits(int p){
		long sum = 1;
		for(int n = 1; n <= p; n++){
			sum*=2;
			sum = (long) (sum % 10000000000.0);
		}
		return sum;
	}
	
}
