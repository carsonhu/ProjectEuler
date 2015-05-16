package main.classes;

import java.math.BigDecimal;
import java.util.ArrayList;

import main.functions.Sort;

public class Euler205DiceGame {
	public static void run(){
		ArrayList<Integer> pyramidalpete = sampling(4, 9);
		ArrayList<Integer> cubiccolin = sampling(6, 6);
		Sort sorter = new Sort();
		pyramidalpete =sorter.sort(pyramidalpete);
		cubiccolin = sorter.sort(cubiccolin);
		int[][] freqTable1 = new int[28][2];
		int[][] freqTable2 = new int[31][2];
	//	int[][] freqTable2 = new int[11][2];
		freqTable1 = freqGo(9, 36, freqTable1, pyramidalpete);
		freqTable2 = freqGo(6, 36, freqTable2, cubiccolin);
	//	freqTable2 = freqGo(2, 12, freqTable2, cubiccolin);
		/*for(int i = 0; i < freqTable2.length; i++){
			System.out.println(freqTable2[i][0] + " " + freqTable2[i][1]);
		}*/
		
		double prob = 0;
		for(int i = 9; i <=36; i++){
			double num1 = iguals(freqTable1, i);
			double num2 = lessthan(freqTable2, i);
			prob+= num1 * num2;
		}
		System.out.println(prob);
	}
	
	public static double iguals(int[][] freqTable, int num){
		int sum = 0;
		for(int i = 0; i < freqTable.length; i++){
			if(freqTable[i][0] == num){
				sum+= freqTable[i][1];
			}
		}
		int max = 0;
		for(int i = 0; i < freqTable.length; i++){
			max += freqTable[i][1];
		}
		double result = sum / (double)max;
		return result;
		
	}
	
	public static double lessthan(int[][] freqTable, int num){
		int index = 0;
		for(int i = 0; i < freqTable.length; i++){
			if(freqTable[i][0] == num){
				index = i;
			}
		}
		int max = 0;
		for(int i = 0; i < freqTable.length; i++){
			max += freqTable[i][1];
		}
		
		int sum = 0;
		for(int i = index - 1; i >=0; i--){
			sum+= freqTable[i][1];
		}
		double result = sum / (double) max;
		return result;
		
	}
	
	public static int[][] freqGo(int min, int max, int[][] freqTable, ArrayList<Integer> player){
		for(int i = 0; i < freqTable.length;i++){
			freqTable[i][0] = min + i;
		}
		int index = 0;
		for(int i = 0; i < player.size(); i++){
			if(player.get(i) == freqTable[index][0]){
				freqTable[index][1]+= 1;
			}else{
				index++;
				i--;
			}
		}
		
		
		return freqTable;
	}
	
	public static ArrayList<Integer> sampling(int x, int n){ //x is # sides on dice, n is number of timies
		int[] ints = new int[n];
		for(int k = 0; k < ints.length; k++){
			ints[k] = 1;
		}
		ints[n - 1] = 0;
		ArrayList<Integer> sums = new ArrayList<Integer>();
		while(ints[0] <= x){
			ints[n-1]+=1;
			for(int i = n - 1; i >0; i--){
				if(ints[i] > x){
					ints[i-1] += 1;
					ints[i] = 1;
				}
			}
			if(ints[0] <= x){
			int sum = 0;
			for(int j : ints){
				sum += j;
			}
			sums.add(sum);
		//	System.out.println(sum);
		//	System.out.println();
			for(int m : ints){
		//		System.out.print(m + " ");
			}
			}
		}
		return sums;
	}
	
	
	
}
