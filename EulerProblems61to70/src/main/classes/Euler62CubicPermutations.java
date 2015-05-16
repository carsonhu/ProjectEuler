package main.classes;

import java.util.ArrayList;

import main.functions.EulerFunctions;
import main.functions.Sort;

public class Euler62CubicPermutations { //would do if i could sort
	public static void run(){
		ArrayList<long[]> cubes = new ArrayList<long[]>();
		
		for(int i = 0; i < 1000; i++){
			long[] cubo = new long[3];
			long theNum = (long) Math.pow(i, 3);
			cubo[0] = theNum;
			String strNum = Long.toString(theNum);
			int length = strNum.length();
			cubo[1] = length;
			int sum = 0;
			for(int j = 0; j < length; j++){
				sum+= Integer.parseInt(strNum.substring(j, j + 1));
			}
			cubo[2] = sum;
			cubes.add(cubo);
		}
		
		cubes = lameSort(cubes, 1);
		for (long[] thing : cubes) {
	//		System.out.println(thing[0] + " " + thing[1] + " " + thing[2]);
		}
		
		ArrayList<long[]> sizeNine = new ArrayList<long[]>();
		for(long[] thung : cubes){
			if(thung[1] == 9){
				sizeNine.add(thung);
			}
		}
		
		long[][] vals = new long[65][2];
		for(int i =0; i < vals.length; i++){
			vals[i][0] = i;
		}
		
		sizeNine = lameSort(sizeNine, 2);
		
		for(long[] item : sizeNine){
			int sum = (int) item[2];
			vals[sum][1] ++;
		}
		
		ArrayList<long[]> sizeNineTwo = new ArrayList<long[]>();
		
		for(int i = 0; i < sizeNine.size(); i++){
			int sum = (int) sizeNine.get(i)[2];
			if(vals[sum][1] >= 5){
				sizeNineTwo.add(sizeNine.get(i));
			}
		}
		
		for(int i = 0; i < sizeNineTwo.size(); i++){
			
		}
		
	/*	ArrayList<ArrayList<long[]>> soMeta = new ArrayList<ArrayList<long[]>>();
		for (int i = 1; i <= 9; i++) {
			ArrayList<long[]> slightlyMeta = new ArrayList<long[]>();
			for (int j = 0; j < cubes.size(); j++) {
				if(cubes.get(j)[1] == (long)i){
					slightlyMeta.add(cubes.get(j));
				}else{
					j = cubes.size();
				}
			}
			soMeta.add(slightlyMeta);
		}
		
		for(int i = 0; i < soMeta.size(); i++){
			soMeta.set(i, lameSort(soMeta.get(i), 2));
		}
		
		for(ArrayList<long[]> whatamidoing : soMeta){
			for(long[] yo : whatamidoing){
				System.out.println(yo);
			}
		}*/
		
	}
	
	public static ArrayList<long[]> lameSort(ArrayList<long[]> nums, int ind){ //sort array by length. i think this is selection sort idk
		ArrayList<long[]> newNums = new ArrayList<long[]>();
		while(nums.size() > 0){
			long lowest = 99999;
			int theIndex = -1;
		for(int i = 0; i < nums.size(); i++){
			if(nums.get(i)[ind] < lowest){
				lowest = nums.get(i)[ind];
				theIndex = i;
			}
		}
		newNums.add(nums.get(theIndex));
		nums.remove(theIndex);
		}
		return newNums;
	}
	
}
