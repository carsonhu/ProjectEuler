package main.classes;

public class Euler173Laminae {
	public static void run(){
		int count = 0;
		for(int i = 1; i < 250000; i++){
			int squares = 0;
			int n = 0;
			while(squares <= 1000000){
				squares+= 4 * (2*n + i) + 4;
				if(squares <= 1000000){
				count++;
				}
				n++;
			}
		}
		System.out.println(count);
	}
}
