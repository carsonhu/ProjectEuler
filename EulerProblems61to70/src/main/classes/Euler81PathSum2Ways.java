package main.classes;

import java.util.ArrayList;

import main.functions.MyFileReader;

public class Euler81PathSum2Ways {
	public static void run(){
		MyFileReader myFileReader = new MyFileReader();
		ArrayList<String> lines = myFileReader.readMyFile("matrix.txt");
		int[][] theNumbers = new int[80][80];
		for(int i = 0; i < theNumbers.length; i++){ //fill the 2d matrix
			String[] oneLine = lines.get(i).split(",");
			for(int j = 0; j < oneLine.length; j++){
				theNumbers[i][j] = Integer.parseInt(oneLine[j]);
			}
		}
		
		
		int[][] newNumbers = new int[159][80];
		newNumbers[0][0] = theNumbers[0][0];
		for(int i = 1; i < theNumbers.length; i++){
			int j = 0;
			while(j <= i){
				newNumbers[i][j] = theNumbers[j][i - j];
				j++;
			}
		}
		
	}
}
