package main.classes;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class Euler104PandigitalFibonacci {
	public static void run(){
		BigInteger a = BigInteger.ONE;
		BigInteger b = BigInteger.ONE;
		boolean yes = false;
		int count = 2;
		while(yes == false){
			BigInteger c = a.add(b);
			a = b;
			b = c;
			if(count == 4){
				System.out.println(a);
				System.out.println(b);
			}
			count++;
			String bStr = b.toString();
			if( bStr.length() > 21){
				ArrayList<Integer> chars = new ArrayList<Integer>();
			for(int i = 0; i <= 9; i++){
				chars.add(Integer.parseInt(bStr.substring(i,  i+ 1)));
			}
				ArrayList<Integer> chars2 = new ArrayList<Integer>();
				for(int i = bStr.length() - 10; i < bStr.length(); i++){
					chars2.add(Integer.parseInt(bStr.substring(i,  i+ 1)));
				}
				
			yes = true;
			for(int i = 0; i <= 9; i++){
				if(!chars.contains(i) || !chars2.contains(i)){
					yes = false;
				}
			}
			}
			
		}
		System.out.println(count);
	}




}