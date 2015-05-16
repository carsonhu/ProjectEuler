package main.classes;

public class Euler64OddPeriodSquareRoots {
	public static void run(){
		int count = 0;
		for(int i = 2; i <=10000; i++){
			if((double)Math.sqrt(i) != (int) Math.sqrt(i)){
				if(findIt(i)){
					count++;
				}
			}
		}
		System.out.println(count);
	}
	
	
	public static boolean findIt(int n){
		return true;
	}
	
}
