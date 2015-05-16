package main.classes;

public class Euler78CoinPartitions {
	public static int totall;
	public static void run(){
		int i = 4;
		int count = 1;
		while(count % 1000000 != 0){
			totall = i;
			count = summarte(0, i);
			i++;
			System.out.println("i: " + i + ", count: " + count);
		}
		System.out.println(i);
	}
	public static int summarte(int total, int n){
		int count = 0;
		int n2 = totall - total;
		if(n2 > n){
			n2 = n;
		}

		for(int i = n2; i > 0; i--){
			//System.out.println(i);
			if(total + i < totall){
			count+=summarte(total + i, i);			
			}else if(total + i == totall){
				count++;
			}
		}
		
		return count;
	}
	
}
