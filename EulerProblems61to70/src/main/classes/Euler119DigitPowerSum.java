package main.classes;

import java.math.BigDecimal;
import java.util.ArrayList;

import main.functions.Sort;

public class Euler119DigitPowerSum {
	public static void run(){
	/*for(int i = 10; i < 10000000; i++){
		double theNum2 = i;
		String theNum = Integer.toString(i);
		int digitSum = 0;
		for(int j = 0; j < theNum.length(); j++){
			digitSum += Integer.parseInt(theNum.substring(j, j+1));
		}
		if(digitSum > 1){
		while(theNum2 > digitSum){
			theNum2 = theNum2 / digitSum;
		}
		}
		if(theNum2 == digitSum){
			System.out.println(i + " " + digitSum);
		}
	}
	}*/
	/*ArrayList<BigDecimal> nums = new ArrayList<BigDecimal>();
	for(long i = 2; i < 1000; i++){
		BigDecimal n = new BigDecimal(i);
		
		int exponent = 1;
		BigDecimal max = new BigDecimal(10).pow(30);
		while(n.compareTo(max) < 0){
			n = new BigDecimal(i).pow(exponent);
			
			String theNum = n.toString();
			int digitSum = 0;
			for(int j = 0; j < theNum.length(); j++){
				digitSum += Integer.parseInt(theNum.substring(j, j+1));
			}
			if(i == digitSum && n.compareTo(new BigDecimal(10)) > 0){
				nums.add(n);
			//	System.out.println(n + " " + digitSum);
			//	System.out.println(n + " " + i);
				n = max;
			}else{
				exponent+=1;
			}
			
		}
	}
	Sort sorter = new Sort();
	nums = sorter.sort(nums);
	for(int i = 0; i < nums.size(); i++){
		System.out.println(nums.get(i) + " " + i);
	}*/
		ArrayList<Long> nums = new ArrayList<Long>();
		for(long i = 2; i < 200; i++){
			long n = i;
			
			int exponent = 1;
			long max = Long.MAX_VALUE;
			while(n < max){
				n = (long) Math.pow(i, exponent);
				
				String theNum = Long.toString(n);
				int digitSum = 0;
				for(int j = 0; j < theNum.length(); j++){
					digitSum += Integer.parseInt(theNum.substring(j, j+1));
				}
				if(i == digitSum && n >= 10){
					nums.add(n);
				//	System.out.println(n + " " + digitSum);
				//	System.out.println(n + " " + i);
					n = max;
				}else{
					exponent+=1;
				}
				
			}
		}
		Sort sorter = new Sort();
		nums = sorter.sort(nums);
		
		for(int i = 0; i < nums.size(); i++){
			for(int j = 0; j < 100; j++){
				
			}
		}
		
		for(int i = 0; i < nums.size(); i++){
			System.out.println(nums.get(i) + " " + i);
		}
	
}
}
