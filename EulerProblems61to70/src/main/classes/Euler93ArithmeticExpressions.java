package main.classes;

import java.util.ArrayList;

public class Euler93ArithmeticExpressions {
	public static void run(){
		int n = 4;
		//the scariest set of for loops you'll ever see
		for(double a = 1; a <= 4; a++){
			for(double b = 1; b <= 4; b++){
				for(double c = 1; c <= 4; c++){
					for(double d = 1; d <= 4; d++){ //1, 2, 3, 4
						for(int ab = 1; ab <= 4; ab++){ //arithmetic operators
							for(int bc = 1; bc <= 4; bc++){
								for(int cd = 1; cd <= 4; cd++){
									
								}
							}
						}
					}
				}
			}
		}
	}
	
	public static double operate(double a, double b, int x){
		if(x == 1){
			return a + b;
		}else if( x== 2){
			return a - b;
		}else if( x == 3){
			return a * b;
		}else if(x == 4){
			return a / b;
		}
		return x;
	}
	
}
