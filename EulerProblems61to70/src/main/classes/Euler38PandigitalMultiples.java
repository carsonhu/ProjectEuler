package main.classes;

public class Euler38PandigitalMultiples {
	public static void run(){
		int max = 0;
		for(int i = 1; i < 499999999;i++){
			String str = "";
			int n = 1;
			while(str.length() <9){
				str+= i * n;
				n++;
			}
			if(n!= 1){
			if(str.length() == 9){
				if(str.contains("1") && str.contains("2") && str.contains("3") && str.contains("4") && str.contains("5") && str.contains("6") && str.contains("7") 
						&& str.contains("8") && str.contains("9")){
					if(Integer.parseInt(str) > max){
						max = Integer.parseInt(str);
						System.out.println(i);
					}
				}
			}
		}
		}
		System.out.println(max);
	}
}
