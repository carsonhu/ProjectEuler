package main.data;

public class Point {
	double theX;
	double theY;
	public Point(String x, String y){
		theX = Double.parseDouble(x);
		theY = Double.parseDouble(y);
	}
	
	public Point(double x, double y){
		theX = x;
		theY = y;
	}
	
	public double getX(){
		return theX;
	}
	public double getY(){
		return theY;
	}
}
