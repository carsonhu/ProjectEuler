package main.classes;

import java.util.ArrayList;

public class Euler45TriPentHex {
	public static void run(){
		ArrayList<Integer> triNumbers = new ArrayList<Integer>();
		ArrayList<Integer> pentNumbers = new ArrayList<Integer>();
		ArrayList<Integer> hexNumbers = new ArrayList<Integer>();
		for(double i = 0; i < 99999; i++){
			triNumbers.add((int)( i * (i+ 1) / 2));
			pentNumbers.add((int)( i * (3 * i - 1) / 2));
			hexNumbers.add((int) (i * (2 * i - 1)));
		}
		for(int i: triNumbers){
			if(pentNumbers.contains(i) && hexNumbers.contains(i)){
				System.out.println(i);
			}
		}
	}
}
