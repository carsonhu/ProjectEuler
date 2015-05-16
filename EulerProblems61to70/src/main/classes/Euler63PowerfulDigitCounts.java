package main.classes;

import java.math.BigDecimal;

public class Euler63PowerfulDigitCounts {
	public static void run(){
		int totalCount = 9;
		//account for 1-9 being a 1 digit
		
		for(int n = 2; n < 23; n++){
		//	double yaargh = Math.pow(10, n - 1);
			for(int j = 2; j < 1000; j++){
				
				BigDecimal ans = new BigDecimal(Math.pow(j, n));
				if(ans.compareTo(new BigDecimal(Math.pow(10, n -1))) >= 0 && ans.compareTo(new BigDecimal(Math.pow(10, n))) < 0){
					totalCount++;
					System.out.println(ans + " " + j + " " + n);
				}
			}
		}
		System.out.println(totalCount);
		
		/* 
		  for(int i = 1; i < Integer.MAX_VALUE; i++){
			int currentCount = 0;
			for(int j = 1; j < 99; j++){
				BigDecimal yo = new BigDecimal(i);
				yo = yo.pow(j);
				String letterForme = yo.toString();
				if(i <= 10 && j > 10){
					j = 9999;
				}
				
				if(letterForme.length() == j){
					currentCount++;
					System.out.println(yo + " " + letterForme);
				}else if(letterForme.length() > j){
					j = 9999;
				}
			}
			if(currentCount == 0){
				i = 9999;
			}else{
				totalCount+= currentCount;
				//System.out.println(totalCount);
			}
			
		}
		System.out.println(totalCount);*/
	}
}
