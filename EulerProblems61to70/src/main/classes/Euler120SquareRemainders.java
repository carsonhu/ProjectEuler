package main.classes;

public class Euler120SquareRemainders {
	public static void run(){
		int sumrMax = 0;
		for(int a = 3; a <= 1000; a++){
			double firstNum = 1;
			double secondNum = 1;
			int rMax = 0;
			for(int n = 1; n <= 10000; n++){
				firstNum *= a- 1;
				firstNum %= Math.pow(a, 2);
				secondNum *= a + 1;
				secondNum %= Math.pow(a, 2);
				if((firstNum + secondNum) % Math.pow(a,2) > rMax){
					rMax = (int) ((firstNum + secondNum) % Math.pow(a,2));
				}
			}
			System.out.println(a + " " + rMax);
			sumrMax += rMax;
		}
		System.out.println(sumrMax);
		}
}
