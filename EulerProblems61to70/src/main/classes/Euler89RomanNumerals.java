package main.classes;

import java.util.ArrayList;

import main.functions.MyFileReader;

public class Euler89RomanNumerals {
	public static void run(){
		MyFileReader myFileReader = new MyFileReader();
		ArrayList<String> romans = myFileReader.readMyFile("roman.txt");
		
		for(String i : romans){
			
		}
	}
	
	public double findRomanValue(String str){
		double value = 0;
		double tempValue = 0;
		for(int i = 0; i < str.length() - 1; i++){
			String num = str.substring(i, i+1);
			String nextNum = str.substring(i+1, i + 2);
			tempValue += getValue(num);
			if(getValue(num) < getValue(nextNum)){
				tempValue = getValue(nextNum) - tempValue;
				i++;
				value+= tempValue;
				tempValue = 0;
				}
			else if(getValue(num) > getValue(nextNum)){
				value+= tempValue;
				tempValue = 0;
			}
		}
		if(getValue(str.substring(str.length() - 1, str.length())) <= getValue(str.substring(str.length() - 2 , str.length()))){
			value += getValue(str.substring(str.length() - 1, str.length()));
		}
		return value;
	}
	
	public double getValue(String rome){
		if(rome == "X"){
			return 10;
		}else if(rome == "V"){
			return 5;
		}else if(rome == "I"){
			return 1;
		}else if(rome == "L"){
			return 50;
		}else if(rome == "C"){
			return 100;
		}else if(rome == "D"){
			return 500;
		}else if(rome == "M"){
			return 1000;
		}else{
			System.out.println("wat");
			return 0;
		}
	}
}
