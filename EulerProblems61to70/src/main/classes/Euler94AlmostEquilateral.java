package main.classes;

public class Euler94AlmostEquilateral {
	public static void run(){
		long perimeterSum = 0;
		double s = 1000000000 / 2;
		System.out.println(Math.sqrt(s * (s - 333333333.0) * (s - 333333333.0) * (s- 333333334.0)));
		for(long i = 3; i <= 333333335; i = i + 2){
			
				if(heron(i,i, i-1) && (3*i - 1 < 1000000000)){
					perimeterSum += 3 * i - 1;
				//	System.out.println(i);
				}
				if(heron(i, i, i+ 1) && (3*i + 1 < 1000000000)){
					perimeterSum += 3 * i + 1;
					//System.out.println(i);
				}
			
		}
		System.out.println(perimeterSum);
	}
	public static boolean heron(double a, double b, double c){
		double s = (a + b + c) / 2;
		double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
		if(area == Math.floor(area)){
			return true;
		}else{
			return false;
		}
	}
	
}
