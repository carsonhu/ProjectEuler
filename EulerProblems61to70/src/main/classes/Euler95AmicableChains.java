package main.classes;

public class Euler95AmicableChains {
	public static void run(){
		System.out.println(d(2));
		int maxCount = 0;
		for(int i = 1; i < 1000000; i++){
	
			int currentN = d(i);
			int count = 1;
			int smallestNumber = currentN;
			while(currentN < 1000000 && currentN != i && currentN > 1 && currentN != 89){
				currentN = d(currentN);
				if(currentN < smallestNumber){
					smallestNumber = currentN;
				}
				count++;
			}
			if(count > maxCount && currentN == i && currentN > 1 && currentN != 89){
				maxCount = count;
				System.out.println(maxCount + " " + smallestNumber);
			}
			
		}
		System.out.println(maxCount);
	}
	
	public static int d(double n){
		int tempSum = 1;
		for(int i = 2; i <= Math.sqrt(n); i++){
			if(n / i == Math.floor(n / i)){
			tempSum += i;
			if( i != n / i)
			tempSum += n / i;
			}
		}
		return tempSum;
	}
}
