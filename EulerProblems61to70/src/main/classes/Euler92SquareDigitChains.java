package main.classes;

public class Euler92SquareDigitChains {
	public static void run(){
		int count = 0;
		for(int i = 2; i < 10000000; i++){
			 int j = i;
			 while(j != 1 && j!= 89){
				 j = getDigitValue(j);
			 }
			 if(j == 89){
				 count++;
			 }
		}
		System.out.println(count);
	}
	
	public static int getDigitValue(int n){
		int tempN = n;
		int sum = 0;
		while(tempN > 0){
		sum+= Math.pow((tempN % 10),2);
		tempN /= 10;
		}
		return sum;
	}
}
