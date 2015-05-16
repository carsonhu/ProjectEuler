package main.classes;

import java.util.ArrayList;

import main.functions.*;

public class Euler67MaxPathSum2 {
	public static void run(){
		MyFileReader myFileReader = new MyFileReader();
		ArrayList<String> lines = myFileReader.readMyFile("triangle.txt");
		int[][] theNumbers = new int[80][80];
		for(int i = 0; i < theNumbers.length; i++){ //fill the 2d matrix
			String[] oneLine = lines.get(i).split(" ");
			for(int j = 0; j < oneLine.length; j++){
				theNumbers[i][j] = Integer.parseInt(oneLine[j]);
			}
		}

	//	tournament(theNumbers);
	
	
	}
	/*public static void tournament(int[][] aMatrix){
		int length = aMatrix.length;
		System.out.println(aMatrix[99][0]);
		for(int j = length - 1; j > 0; j--){
			for(int i = 0; i < j; i++){
				
				int num1 = aMatrix[j][i];
				int num2 = aMatrix[j][i+1];
				if(num1 >= num2){
					aMatrix[j-1][i] += num1;
					System.out.println(num1);
				}else{
					aMatrix[j-1][i] += num2;
					System.out.println(num2);
				}
			}
		}
		System.out.println(aMatrix[0][0]);
	}*/

}
