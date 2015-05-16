package main.classes;

import java.math.BigDecimal;

public class Euler56PowerfulDigitSum {
	public static void run(){
		int maxSum = 0;
		for(int i = 2; i < 100; i++){
			for(int j = 11; j < 100; j++){
				BigDecimal ii = new BigDecimal(i);
				BigDecimal k = ii.pow(j);
				String kString = k.toString();
				int sum = 0;
				for(int u = 0; u < kString.length(); u++){
					sum += Integer.parseInt(kString.substring(u, u + 1));
				}
				if(sum > maxSum){
					maxSum = sum;
				}
			}
		}
		System.out.println(maxSum);
	}
}
