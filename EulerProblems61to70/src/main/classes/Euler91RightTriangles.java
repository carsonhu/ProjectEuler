package main.classes;

import java.util.ArrayList;

public class Euler91RightTriangles {
	public static void run(){
		int count = 0;
		ArrayList<String> ints = new ArrayList<String>();
		for(int y1 = 0; y1 <= 50; y1++){
			for(int x1 = 0; x1 <= 50; x1++){
				for(int y2 = 0; y2 <= 50; y2++){
					for(int x2 = 0; x2 <= 50; x2++){
						int oX = 0;
						int oY = 0; 
						//vec 1 = <x1, y1>. vec 2 = <x2 - x1, y2 - y1>. vec 3 = <x2, y2>
						//if they are orthogonal then x1(x2 - x1) + y1(y2 - y1) = 0
						if(!(x1 == x2 && y1 == y2)){
						if(x1 == 0 && x2 == 0){
							
						} else if(y1 == 0 && y2 == 0){
							
						}else if (x1 == 0 && y1 == 0){
						
						}else if (x2 == 0 && y2 == 0){
						
						}else{
						if(dotProduct(x1, y1, x2 - x1, y2 - y1) == 0 || dotProduct(x1, y1, x2, y2) == 0 || dotProduct(x2, y2, x2 - x1, y2 - y1) == 0){
							String someInts = x1 + " " + y1 + " " + x2 + " " + y2;
							String reverseInts = x2 + " " + y2 + " " + x1 + " " + y1;
							
							if(!ints.contains(reverseInts)){
							count++;
							ints.add(someInts);
							System.out.println(x1 + " " + y1 + " " + x2 + " " + y2);
						}
						}
						}
						}
					
					}
				}
			}
		}
		System.out.println(count);
	}
	
	public static int dotProduct(int x1, int y1, int x2, int y2){
		return x1 * x2 + y1 * y2;
	}
	
}
