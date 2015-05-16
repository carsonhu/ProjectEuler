package main.classes;

import java.util.ArrayList;

public class Euler85CountingRectangles {

	public static void run(){
		int x = 1;
		int count = 0;
		System.out.println(count(77, 36));
	/*	while(count < 2000000){
			count = count(x, 1);
			x++;
		}
		//it's 2001
		ArrayList<Integer> ints = new ArrayList<Integer>();
		int i = x;
		for(int j = 1; j < 9999; j++){
			int curCount = 4000000;

			while(curCount > 2000000){
				curCount = count(i, j);
				i--;
			}
				int curCount2 = count(i + 2, j);
				int c1 = Math.abs(curCount - 2000000);
				int c2 = Math.abs(2000000 - curCount2);
				if(c1 < c2){
					ints.add(curCount);
					System.out.println(i + " " + j + " " + curCount + " " + curCount2);
				}else{
					ints.add(curCount2);
					System.out.println(i + " " + j + " " + curCount2 + " " + curCount);
				}
				
				if(i < j){
					break;
				}
		}
		int min = 99999999;
		for(int u = 0; u < ints.size(); u++){
			if(Math.abs(ints.get(u) - 2000000) < min){
				min = ints.get(u);
				System.out.println(min +  " " + "a");
			}
		}
		System.out.println(min);
		System.out.println(ints.size());*/
	}
	
	public static int count(int x, int y){
	
		int count = 0;
		for(int i = 1; i <= x; i++){
			for(int j = 1; j<=y; j++){
				int currentY = 0;
				while(currentY + j <= y){
					for(int k = 0; k <= x; k++){
						if(k + i > x){
							currentY++;
							k = x + 9;
						}else{
							count++;
						}
					}
				}
		}
	}
		return count;
	}
}
