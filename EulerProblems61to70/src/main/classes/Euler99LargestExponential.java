package main.classes;

import java.util.ArrayList;

import main.functions.MyFileReader;

public class Euler99LargestExponential {
	public static void run(){
		MyFileReader fileReader = new MyFileReader();
		ArrayList<String> lines = fileReader.readMyFile("base_exp.txt");
		
		//a^b ? c^d. so b * (log a / log c)
		double maxC = 519432; //line 1 c
		double maxD = 525806; //line 1 d
		int lineNo = 0;
		for(int i = 1; i < lines.size(); i++){
		String[] parts = lines.get(i).split(",");
			double a = Double.parseDouble(parts[0]);
			double b = Double.parseDouble(parts[1]);
			double compared = b * (Math.log(a) / Math.log(maxC));
			if(compared > maxD){
				maxC = a;
				maxD = b;
				lineNo = i + 1;
			}
			
		
		}
		System.out.println(lineNo);
		
	}
}
