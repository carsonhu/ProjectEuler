package main.classes;

import java.util.ArrayList;

import main.functions.EulerFunctions;

public class Euler66DiophantineEquation {
	public static void run(){
		ArrayList<Long> squares = new ArrayList<Long>();
		for(long i = 1; i < 1000000; i++){
			squares.add(i * i);
		}
		long maxN = 0;
		int theD = 0;
		for(int d = 1; d <= 1000; d++){
			//if(!squares.contains(d)){
				ArrayList<Long> newSquares = new ArrayList<Long>();
			for(int i = 0; i < squares.size(); i++){
				newSquares.add(squares.get(i) * d + 1);
			}
			for(long num : newSquares){
				double sqr = Math.sqrt(num);
				if(sqr == (int) sqr){
					if(num > maxN){
						maxN = num;
						theD = d;
						System.out.println(maxN);
						System.out.println(theD);
					}
				}
			}
			//}
		}
	
	}
}
