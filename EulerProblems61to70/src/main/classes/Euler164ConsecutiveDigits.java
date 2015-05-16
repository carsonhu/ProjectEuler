package main.classes;

public class Euler164ConsecutiveDigits {
	public static void run(){
		int[] numbers = new int[20];
		int last = numbers.length - 1;
		while(numbers[0] <= 9){
			numbers[last] += 1;
			for(int i = 1; i < numbers.length; i++){
				if(numbers[i - 1] > 9){
					
				}
			}
		}
	}
}
