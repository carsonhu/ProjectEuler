package main.classes;

import java.util.ArrayList;

public class Euler76CountingSummations {
	public static int totall = 100;
	public static void run(){
		
		
		
		System.out.println(summarte(0, totall));
		
	
	}
	
	public static int summarte(int total, int n){
		int count = 0;
		int n2 = totall - total;
		if(n2 > n){
			n2 = n;
		}

		for(int i = n2; i > 0; i--){
			//System.out.println(i);
			if(total + i < totall){
			count+=summarte(total + i, i);			
			}else if(total + i == totall){
				count++;
			}
		}
		
		return count;
	}
	
	

}
