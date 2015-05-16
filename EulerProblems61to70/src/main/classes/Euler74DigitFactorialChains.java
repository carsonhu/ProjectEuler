package main.classes;

import java.util.ArrayList;

public class Euler74DigitFactorialChains {
	public static void run(){
		int count = 0;
		for(int i = 1;  i < 1000000; i++){
			ArrayList<Long> nums = new ArrayList<Long>();
			long theNumm = i;
			int count2 = 0;
			boolean cool = false;
			while(cool == false){
				if(nums.contains(theNumm)){
					cool = true;
				}else{
					nums.add(theNumm);
					count2++;
					String theNum = Long.toString(theNumm);
					int sumNum = 0;
					for(int j = 0; j < theNum.length(); j++){
						long aaa = Long.parseLong(theNum.substring(j, j+ 1));
						sumNum += factorial(aaa);
					}
					theNumm = sumNum;
				}
			}
			if(count2 == 60){
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static long factorial(long n){
		
		if(n == 0 || n == 1){
			return 1;
		}
			return n * factorial(n - 1);
		
	}
	
}
