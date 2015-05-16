package main.classes;

import java.util.ArrayList;

public class Euler95AmicableChainsB {
	static ArrayList<Integer> aList = new ArrayList<Integer>();
	static boolean isAmicable;
	public static void run(){
		ArrayList<int[]> nums = new ArrayList<int[]>();
		int[] nu = new int[2];
		nums.add(nu);
		nums.add(nu); //this is just so i dont get indexes confused
		for(int i = 2; i <= 1000000; i++){
			int[] num = new int[2];
			num[0] = i;
			num[1] = d(i);
			nums.add(num);
		}
		
		for(int k = 561; k < 563; k++){
			System.out.println(nums.get(k)[0] + " " + nums.get(k)[1]);
		}
		int smallestN = 0;
		int maxCount = 0;
		
		for(int j = 2; j <= 1000000; j++){
			System.out.println();
			System.out.print(j + " ");
			int smallN = j;
			if(nums.get(j)[0] != 0){
			
			ArrayList<Integer> toRemoveInts = new ArrayList<Integer>();
			toRemoveInts.add(smallN);
			int currentN = nums.get(smallN)[1];
			while(currentN <= 1000000 && currentN != smallN && currentN > 1){
				if(!toRemoveInts.contains(currentN)){
				toRemoveInts.add(currentN);
				currentN = nums.get(currentN)[1];
				}else{
					break;
				}
			}
			if(currentN == smallN){
		//	if(isAmicable){
			int length = toRemoveInts.size();
			if(length > maxCount){
				maxCount = length;
				smallestN = smallN;
				System.out.println(maxCount + " " + smallestN);
			}
			}
			//}
			/*for(int u : toRemoveInts){
				int b = nums.get(u)[1];
				nums.set(u, new int[]{0, b});
			}*/
		}
		System.out.println(smallestN);}
		}
		
	
	
	/*public static void amicable(int original){
		isAmicable = false;
		aList = new ArrayList<Integer>();
		aList.add(original);
		int current = d(original);
		if(current == 1 || current > 1000000){
		}else if(current == aList.get(0)){
			aList.add(current);
			isAmicable = true;
		}else{
			amicable(current);
		}
	}*/
	
	public static int d(int nn){
		double n = (double) nn;
		int tempSum = 1;
		if(n == 2 || n ==3){
			return 1;
		}else{
		
		for(int i = 2; i <= Math.sqrt(n); i++){
			if(n / i == Math.floor(n / i)){
			tempSum += i;
			if( i != n / i)
			tempSum += n / i;
			}
		}
		return tempSum;
	}
	}
}
