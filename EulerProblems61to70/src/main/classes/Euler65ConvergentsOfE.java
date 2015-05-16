package main.classes;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Euler65ConvergentsOfE {
	public static ArrayList<Integer> values = new ArrayList<Integer>();
	public static void run(){
		
		values.add(0);
		int n = 1;
		for(int i = 1; i < 100; i++){
			if(i % 3 == 2){
				values.add(n * 2);
				n++;
			}else{
				values.add(1);
			}
		}
		
		pseudonacci(new BigDecimal(2), new BigDecimal(1), new BigDecimal(3), new BigDecimal(1), 2);
		
	}
	
	public static void pseudonacci(BigDecimal numer1, BigDecimal denom1, BigDecimal numer2, BigDecimal denom2, int index){
		if(index == 100){
			String numm = numer2.toString();
			int sum = 0;
			for(int i = 0; i < numm.length(); i++){
				sum += Integer.parseInt(numm.substring(i, i+1));			
			}
			System.out.println(sum);
		}else{
		
		BigDecimal aValue = new BigDecimal(values.get(index));
		
		BigDecimal numer3 = (numer2.multiply(aValue)).add(numer1);
		BigDecimal denom3 = (denom2.multiply(aValue)).add(denom1);
		System.out.println(numer3 + "/" + denom3);
		pseudonacci(numer2, denom2, numer3, denom3, index + 1);
		}
	}
	
}
