package main.classes;

public class Euler71OrderedFractions {
	public static void run(){
		double maxNum = 0;
		double theI = 0;
		double theJ = 0;
		for(int n = 1000000; n > 8; n--){
			for(double i = (int)(0.4 * n); i < 3.0/7 *n; i++){
				double num = i / n;
				if(num > maxNum){
					maxNum = num;
					theI = i;
					theJ = n;
					System.out.println(maxNum + ",  " + (int)theI + ", " + (int)theJ);
				
				
				}
			}
		}
		System.out.println(theI);
	}
}
