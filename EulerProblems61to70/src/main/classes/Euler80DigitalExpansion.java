package main.classes;

import java.math.BigDecimal;

public class Euler80DigitalExpansion {
	public static void run(){
		System.out.println(findSum(2));
	}
	
	public static int findSum(int num){
	
		BigDecimal originalN = new BigDecimal(num);
		BigDecimal n = new BigDecimal(Math.floor(Math.sqrt(num)));
		for(int i = 1; i <= 10; i++){
			BigDecimal yo = new BigDecimal(i * 0.1);
			BigDecimal nuuN = n.add(yo);
			if(nuuN.pow(2).compareTo(originalN) > 0){
				n = nuuN;
				i = 11;
			}
		}
		
		String str = "";
		while(str.length() <= 102){
			for(int i = 1; i <= 10; i++){
				String newN = n.toString();
				if(newN.length() == 1){
					System.out.println("wat");
				}
				newN += i;
				BigDecimal nuuN = new BigDecimal(newN);
				if(nuuN.pow(2).compareTo(originalN) > 0){
					
						newN = n.toString() + (i - 1);
					
					
					n = new BigDecimal(newN);
					i = 11;
				}
			}
		}
		str = n.toString();
		int sum = 0;
		for(int i = 2; i < str.length(); i++){
			String a = str.substring(i, i+1);
			if(!a.equals(".")){
				sum += Integer.parseInt(a);
			}
		}
		return sum;
	}
	
}
