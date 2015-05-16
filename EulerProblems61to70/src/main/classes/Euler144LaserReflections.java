package main.classes;

import main.data.*;

import java.io.IOException;
import java.util.ArrayList;

public class Euler144LaserReflections {
	
	public static double xOut = 0;
	public static double yOut = 0;
	
	
	
	public static void run(){
		double x0 = 0;
		double y0 = 10.1; //origin point
		double vx = 1.4; //1.4
		double vy = -19.7; //end point //-19.7
		Vector2D velocity = new Vector2D(vx, vy);
		mainThung(x0,y0,velocity, 0);
	}

	public static void mainThung(double x0, double y0, Vector2D velocity, double count){
		double vx = velocity.x;
		double vy = velocity.y;
		double a = 4 * Math.pow(vx, 2) + Math.pow(vy, 2);
		double b = 8 * x0 * vx + 2 * y0 * vy;
		double c = 4 * Math.pow(x0, 2) + Math.pow(y0,2) - 100.0;
		
	/*	if(count == 1){ //check for where the fuck the whole is
			double leOrig = 0;
			double ans1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
			double ans2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
			
			if(Math.abs(ans1) <= Math.abs(ans2)){
				leOrig = ans1;
			}else{
				leOrig = ans2;
			}
			
			xOut = vx * leOrig + x0;
			yOut = vy * leOrig + y0;
			System.out.println()
		}*/
		
		
		double t = quadratic(a, b, c);
		boolean cont = true;
		
	
		
		
		double newX0 = vx * t + x0;
		double newY0 = vy * t + y0;
		
		System.out.println("new X0: " + newX0 + "    new Y0: " + newY0);
		
		if(Math.abs(newX0) <= Math.pow(10, -2) && newY0 > 0){
			System.out.println(count);
			cont = false;
		}
		
		//now we gotta reflect v over the normal
		//step 1: FIND THE NORMAL TO THE CURVE
		double m = ( -4 * newX0) / newY0;
		//double mPerp = - 1 / m;
		Vector2D normal = new Vector2D(- m, 1);
		/*if(m >= 0){
		
		normal = new Vector2D(-1, -mPerp);
		}else{
		normal = new Vector2D(1, mPerp);
		}*/
		
		//step 2: FIND UNIT VECTOR
		normal = normal.unitVector();
		System.out.println(normal.x + " " + normal.y);
		double u = velocity.dotProduct(normal);
		Vector2D newO = normal.scalarMult(u);
		Vector2D newV = velocity.plus(newO.scalarMult(-2.0));
		newV = newV.unitVector();
		System.out.println(newV.x + " " + newV.y);
		
	
		
		if(cont == true){
		mainThung(newX0,newY0,newV,count + 1);
		}
	
	}
	
	public static double quadratic(double a, double b, double c){
		double ans1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		double ans2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		
		if(Math.abs(ans1) > Math.abs(ans2)){
			System.out.println("The answer: " + ans1);
			System.out.println("Other answer: " + ans2);
			return ans1;
		
		}else{
			System.out.println("The answer: " + ans2);
			System.out.println("Other answer: " + ans1);
			return ans2;
			
		}
		
	}
	
}
