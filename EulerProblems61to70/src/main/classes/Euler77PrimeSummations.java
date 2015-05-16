package main.classes;

import java.util.ArrayList;

import main.functions.MyFileReader;

public class Euler77PrimeSummations {
	public static int totall;
	public static ArrayList<Integer> primes = new ArrayList<Integer>();
	public static void run(){
		MyFileReader fileReader = new MyFileReader();
		ArrayList<String> lines = fileReader.readMyFile("primes.txt");
		
		for(String u : lines){
			primes.add(Integer.parseInt(u));
			//System.out.println(u);
		}
		
		int i = 2;
		int count = 0;
		while(count < 5000){
			count = 0;
			totall = i;
			count = summarte(0, i);
			i++;
		}
		System.out.println(summarte(0, i));
		System.out.println(i);
	}
	
	public static int summarte(int total, int n){
		int count = 0;
		int n2 = totall - total;
		int i = 0;
		if(n2 > n){
			n2 = n;
		}
		while(primes.get(i) <= n2){
			i++;
		}
		for(int u = i - 1; u >= 0; u--){
			int theP = primes.get(u);
			System.out.println("theP: " + theP + ", n: " + n2);
			if(total + theP < totall){
				count+= summarte(total + theP, theP);
			}else if(total + theP == totall){
				count++;
			}else{
				u = -1;
			}
		}
		return count;
	
		
		
	}
	
}
