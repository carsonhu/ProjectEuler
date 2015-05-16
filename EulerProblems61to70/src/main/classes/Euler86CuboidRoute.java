package main.classes;

public class Euler86CuboidRoute {
	public static void run(){
		
		for(double n = 1; n <= 100; n++){
			int sum = 0;
			for(double x = 1; x <= n; x++){
				for(double y = x; y <= n; y++){
					for(double z = y; z <= n; z++){
						double i = ((y * x) / (y + z));
						double answer = Math.sqrt(i * i + y * y) + Math.sqrt((x - i) * (x - i) + (z * z));
						if(answer == (int) answer){
							sum++;
						}
					}
				}
				
			}
			System.out.println(n + " " + sum);
		}
		
	}
}
