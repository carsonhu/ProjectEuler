package main.classes;

public class Euler31CoinSum {
	public static final int TOTAL_SUM = 200;
	public static void run(){
		int theSum = 0;
		int count = 0;
		
		for(int i = 0; i <=2; i++){
			for(int j = 0; j <=4; j++){
				for(int k = 0; k<= 10; k++){
					for(int l = 0; l <=20; l++){
						for(int m = 0; m <= 40; m++){
							for(int n = 0; n <= 100; n++){
							theSum = (100 * i + 50 * j + 20 * k + 10 * l + 5 * m + 2 * n);
							if(theSum <= 200){
								count++;
							}
							}
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}
