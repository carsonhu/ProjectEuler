package main.classes;

import java.util.*;

public class Euler297Zeckendorf {
	public static void run(){
		int zeckSum = 0;
		for (int i = 1; i <= 200; i++){
			String zeck = getZeckendorf(i);
			int zeckCount = 0;
			for(int j = 0; j < zeck.length(); j++){
				if(zeck.charAt(j) == '1'){
					zeckCount++;
				}
			}
			zeckSum += zeckCount;
		      System.out.println(zeckSum);
		  }
		
		
		
	/*	int aNum = 1;
		int bNum = 1;
		ArrayList<Integer> fibonaccis = new ArrayList<Integer>();
		fibonaccis.add(1);
		for(int i = 0; i < 20; i++){
			int cNum = aNum + bNum;
			fibonaccis.add(cNum);
			aNum = bNum;
			bNum = cNum;
		}
		
		int total = 0; //getting max num
		for(int i = 0; i < fibonaccis.size(); i++){
			total += fibonaccis.get(i);
		}
		int[][] allNums = new int[total + 1][2];
		
		for(int i = 0; i < fibonaccis.size(); i++){ //filling up fibonaccis
			allNums[fibonaccis.get(i)][1] = 1;
		}*/
		
	}
	 public static String getZeckendorf(int n)
	  {
	    if (n == 0)
	      return "0";
	    List<Integer> fibNumbers = new ArrayList<Integer>();
	    fibNumbers.add(1);
	    int nextFib = 2;
	    while (nextFib <= n)
	    {
	      fibNumbers.add(nextFib);
	      nextFib += fibNumbers.get(fibNumbers.size() - 2);
	    }
	    StringBuilder sb = new StringBuilder();
	    for (int i = fibNumbers.size() - 1; i >= 0; i--)
	    {
	      int fibNumber = fibNumbers.get(i);
	      sb.append((fibNumber <= n) ? "1" : "0");
	      if (fibNumber <= n)
	        n -= fibNumber;
	    }
	    return sb.toString();
	  }
}
