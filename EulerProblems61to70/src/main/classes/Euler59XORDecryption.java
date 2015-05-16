package main.classes;

import java.util.ArrayList;

import main.functions.MyFileReader;

public class Euler59XORDecryption {
	public static void run(){
		MyFileReader readur = new MyFileReader();
		ArrayList<String> text = readur.readMyFile("cipher1.txt");
		String[] newStr = text.get(0).split(",");
		int[] newInt = new int[newStr.length];
		for(int i = 0; i < newStr.length; i++){
			newInt[i] = Integer.parseInt(newStr[i]);
		}
		
		for(int i = 97; i <= 122; i++){
			for(int j = 97; j <= 122; j++){
				for(int k = 97; k <=122; k++){
					for(int u = 0; u < newInt.length; u++){
						if(u % 3 == 0){
							int herp = newInt[u] ^ i;
							if( herp >= 65 && herp <= 122){
							System.out.print(" " + (char) (newInt[u]^i));
							}else{
								u = newInt.length;
							}
						}else if(u % 3 == 1){
							int herp = newInt[u] ^ j;
							if(herp >= 65 && herp <= 122){
							System.out.print(" " + (char) (newInt[u]^j));
							}else{
								u = newInt.length;
							}
						}else if(u % 3 == 2){
							int herp = newInt[u] ^ k;
							if(herp >= 65 && herp <= 122){
							System.out.print(" " + (char) (newInt[u]^k));
							}else{
								u = newInt.length;
							}
						}
					}
					System.out.println();
				}
			}
		}


		
	}
}
