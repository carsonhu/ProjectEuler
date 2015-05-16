package main.classes;

import java.util.ArrayList;

import main.functions.EulerFunctions;
import main.functions.MyFileReader;

public class Euler60PrimePairSets {
	
	public static ArrayList<String> lines = new ArrayList<String>();
	
	public static void run(){
	MyFileReader fileReader = new MyFileReader();
	lines = fileReader.readMyFile("primes.txt");
/*	ArrayList<Integer> nums = new ArrayList<Integer>();
	
		for(String i : lines){
		nums.add(Integer.parseInt(i));
		}*/
	
	ArrayList<String> adequate = new ArrayList<String>();
		
	for(int i = 1; i < lines.size(); i++){
		String theNum = lines.get(i);
		if(theNum != "3" && theNum != "7"){
		if(checkPair(theNum, "3") && checkPair(theNum, "7")){
			if(adequate.size() > 0){
				ArrayList<String> counts = new ArrayList<String>();
				for(String u : adequate){
					if(checkPair(theNum,u)){
						counts.add(u);
					}
				}
				if(counts.size() == 2){
					System.out.println(3 + 7 + Integer.parseInt(theNum) + Integer.parseInt(counts.get(0)) + Integer.parseInt(counts.get(1)));
				}
			}
			adequate.add(theNum);
		}
		}
	}
	System.out.println(adequate.size());

	
	}
	
	public static boolean checkPair(String num, String num2){
		String numm = num + num2;
		String numm2 = num2 + num;
		if(lines.contains(numm) && lines.contains(numm2)){
			return true;
		}else{
			return false;
		}
	}
	

	
}
