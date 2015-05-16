package main.classes;

import java.util.ArrayList;

import main.data.Point;
import main.functions.*;

public class Euler102TriangleContainment {
	public static void run(){
		MyFileReader myFileReader = new MyFileReader();
		ArrayList<String> lines = myFileReader.readMyFile("triangles.txt");
		int count = 0;
		for(int i = 0; i < lines.size(); i++){
			//System.out.println(lines.get(i));
			String[] coordinates = lines.get(i).split(",");
			Point point1 = new Point(coordinates[0], coordinates[1]);
			Point point2 = new Point(coordinates[2], coordinates[3]);
			Point point3 = new Point(coordinates[4], coordinates[5]);
			if(checkPoints(point1,point2,point3)){
				count++;
				System.out.print("Point 1: " + coordinates[0] + " , " + coordinates[1] + " ; ");
				System.out.print("Point 2: " + coordinates[2] + " , " + coordinates[3] + " ; ");
				System.out.print("Point 3: " + coordinates[4] + " , " + coordinates[5] + " ; ");
				System.out.println();
				
			}
			
		}
		System.out.println(count);
	}
	
	public static boolean checkPoints(Point point1, Point point2, Point point3){
		double fstX = point1.getX();
		double fstY = point1.getY();
		double secX = point2.getX();
		double secY = point2.getY();
		double thrdX = point3.getX();
		double thrdY = point3.getY();
		
		
		double m12 = (secY - fstY) / (secX - fstX);
		double m13 = (thrdY - fstY) / (thrdX - fstX);
		double m23 = (thrdY - secY) / (thrdX - secX);
		
		boolean up = false;
		boolean right = false;
		boolean left = false;
		boolean down = false;
				
		
		if(f(m12, fstX, fstY, secX, secY, 0) || f(m13, fstX, fstY, thrdX, thrdY, 0) || f(m23, secX, secY, thrdX, thrdY, 0)){
			down = true;
		}
		if(f(m12, fstX, fstY, secX, secY, 1) || f(m13, fstX, fstY, thrdX, thrdY, 1) || f(m23, secX, secY, thrdX, thrdY, 1)){
			left = true;
		}
		if(f(m12, fstX, fstY, secX, secY, 2) || f(m13, fstX, fstY, thrdX, thrdY, 2) || f(m23, secX, secY, thrdX, thrdY, 2)){
			right = true;
		}
		if(f(m12, fstX, fstY, secX, secY, 3) || f(m13, fstX, fstY, thrdX, thrdY, 3) || f(m23, secX, secY, thrdX, thrdY, 3)){
			up = true;
		}
		if(down && left && right && up){
			return true;
		}else{
			return false;
		}
		
		
		
		/*double start = 0;
		double end = 0;
		double firstY = 0;
		if(point1.getX() > point2.getX()){
			start = point2.getX();
			end = point1.getX();
			firstY = point2.getY();
		}else{
			start = point1.getX();
			end = point2.getX();
			firstY = point1.getY();
		}
			int prevX = (int) start;
			double prevY =  firstY;
			for(int x = (int) start; x < end; x++){
				prevX = x -1;
				prevY =  f(m12, (x - 1), point1.getX(), point1.getY());
				double yValue = f(m12, x, point1.getX(), point1.getY());
				if((double)x / prevX < 0 && yValue >= 0){
					posYaxis = true;
				}
				if((double)x / prevX < 0 && yValue <= 0){
					negYaxis = true;
				}
				if(yValue / prevY < 0 && x >= 0){
					posXaxis = true;
				}
				if(yValue / prevY < 0 && x<= 0){
					negXaxis = true;
				}
			}
			
			if(point1.getX() > point3.getX()){
				start = point3.getX();
				end = point1.getX();
				firstY = point3.getY();
			}else{
				start = point1.getX();
				end = point3.getX();
				firstY = point1.getY();
			}
				prevX = (int) start;
				prevY =  firstY;
				for(int x = (int) start; x < end; x++){
					prevX = x -1;
					prevY =  f(m13, (x - 1), point1.getX(), point1.getY());
					double yValue = f(m13, x, point1.getX(), point1.getY());
					if((double)x / prevX < 0 && yValue >= 0){
						posYaxis = true;
					}
					if((double)x / prevX < 0 && yValue <= 0){
						negYaxis = true;
					}
					if(yValue / prevY < 0 && x >= 0){
						posXaxis = true;
					}
					if(yValue / prevY < 0 && x<= 0){
						negXaxis = true;
					}
				}
			
				if(point3.getX() > point2.getX()){
					start = point2.getX();
					end = point3.getX();
					firstY = point2.getY();
				}else{
					start = point3.getX();
					end = point2.getX();
					firstY = point3.getY();
				}
					prevX = (int) start;
					prevY =  firstY;
					for(int x = (int) start; x < end; x++){
						prevX = x -1;
						prevY =  f(m23, (x - 1), point2.getX(), point2.getY());
						double yValue = f(m12, x, point2.getX(), point2.getY());
						if((double)x / prevX < 0 && yValue >= 0){
							posYaxis = true;
						}
						if((double)x / prevX < 0 && yValue <= 0){
							negYaxis = true;
						}
						if(yValue / prevY < 0 && x >= 0){
							posXaxis = true;
						}
						if(yValue / prevY < 0 && x<= 0){
							negXaxis = true;
						}
					}
			if(posYaxis == true && negYaxis == true && posXaxis == true && negXaxis == true){
				return true;
			}else{
				return false;
			}*/
		
	}
	public static boolean f(double m, double x1, double y1, double x2, double y2, int which){ //0 is down, 1 is left, 2 is right, 3 is up
		boolean check = false;
		
		if(which == 0){
			double herp = m * (-x1) + y1; //down
			if(herp <= 0 && ((y1 <= herp && herp <= y2) || (y2 <= herp && herp <= y1))){
				check = true;
			}
		}else if(which == 1){ //left
			double herp = -y1 / m + x1;
			if(herp <= 0 && ((x1 <= herp && herp <= x2) || x2 <= herp && herp <= x1)){
				check = true;
			}
		}else if(which == 2){ //right
			double herp = -y1 / m + x1;
			if(herp >= 0 && ((x1 <= herp && herp <= x2) || x2 <= herp && herp <= x1)){
				check = true;
			}
		}else if(which == 3){
			double herp = m * (-x1) + y1; 
			if(herp >= 0 && ((y1 <= herp && herp <= y2) || y2 <= herp && herp <= y1)){ //up
				check = true;
			}
		}
		return check;
	
	//	if(m * (x2 - x1) + y1);
	}
	
}
