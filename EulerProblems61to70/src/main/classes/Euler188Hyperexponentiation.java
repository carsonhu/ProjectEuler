package main.classes;

public class Euler188Hyperexponentiation {
	public static void run(){
		long a = 1777;
		for(int i = 1; i < 1000; i++){
			a = (long) ((1777 * a) % Math.pow(10, 8));
			//the idea is to figure out how euler's theorem applies to tetration
			
			System.out.println(a);
		}
	}
}
