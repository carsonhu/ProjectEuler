package main.classes;

import java.util.ArrayList;

public class Euler206ConcealedSquare {
	public static void run(){
		for(long i = 0; i < Math.pow(10, 10); i++){
			if(checkIt(i * i)){
				System.out.println(i * i);
			}
		}
	}
	
	public static boolean checkIt(long n){
		String theNumber = Long.toString(n);
	
		if(theNumber.length() == 19){
			if(theNumber.substring(0, 1).equals("1") && theNumber.substring(2, 3).equals("2") && theNumber.substring(4, 5).equals("3") &&
					theNumber.substring(6, 7).equals("4") && theNumber.substring(8, 9).equals("5") && theNumber.substring(10, 11).equals("6") && theNumber.substring(12, 13).equals("7")
					&& theNumber.substring(14, 15).equals("8") && theNumber.substring(16, 17).equals("9") && theNumber.substring(18, 19).equals("0")){
				return true;
			}
		}
		return false;
	}
}
