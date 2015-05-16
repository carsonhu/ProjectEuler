package main.classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import main.functions.MyFileReader;

public class Euler315DigitalRootClocks {
	public static int nil = 0b0000000;
	public static int[] bins = new int[] {0b1111101, 0b0101000, 0b1001111, 0b0101111, 0b0111010, 0b0110111, 0b1110111, 0b0111001, 0b1111111, 0b0111111};
	public static void run(){
		
		MyFileReader fileReader = new MyFileReader();
		ArrayList<String> lines = new ArrayList<String>();
		lines = fileReader.readMyFile("newprimes.txt");
		ArrayList<Integer> ints = new ArrayList<Integer>(); //list of primes
		
		for(int i = 0; i < lines.size(); i++){
			String[] hargh = lines.get(i).split("\\s+");
			for(String u : hargh){
				if(u.length() >= 1){
					int num = Integer.parseInt(u);
						ints.add(num);
						//System.out.println(num);
				}
			}
		}
		long count = 0;
		long otherCount = 0;
		
		for(int theNumm: ints){
			//long theNumm = 1999993;
			while(theNumm > 9){
				int tempNum = theNumm;
				int digsum = digSum(theNumm);
				System.out.println("Digsum: " + digsum);
				String numStr = Integer.toString(tempNum);
				for(int i = 0; i < numStr.length(); i++){
					int theChar = Integer.parseInt(numStr.substring(i,  i + 1));
					otherCount+= 2* hamming(bins[theChar]);
					//System.out.println(hamming(bins[theChar]));
				}
				/*while(tempNum > 0){
					int herp = tempNum % 10;
					otherCount += 2 * hamming(bins[herp]);
					tempNum /= 10;
				
				}*/
			theNumm = digsum;
			}
			if(theNumm == 0){ //in case
				System.out.println("PANIC");
			}
			otherCount += 2 * hamming(bins[theNumm]);
		//}

		}
		System.out.println(otherCount);
		
		for(int theNum : ints){
		System.out.println(theNum);
		//int theNum = 1999993;
		int prevNum = nil;
		while(theNum != prevNum){
			String numStr = Integer.toString(theNum);
			int digsum = digSum(theNum);
			//System.out.println("the Num: " + theNum);
			//System.out.println("Digsum " + digsum);
			if(prevNum == nil){
				//int tempNum = theNum;
				
				
				
				for(int i = 0; i < numStr.length(); i++){
					int theChar = Integer.parseInt(numStr.substring(i,  i + 1));
					count+= hamming(bins[theChar]);
					//System.out.println(hamming(bins[theChar]));
				}
				
			}else{

				int prevNum2 = prevNum;
				int theNum2 = theNum;
				while(prevNum2 > 0){
					int endPrev = (int) prevNum2 % 10;
					int endPrev2 = (int) theNum2 % 10;
					int switched;
					if (theNum2 % 10 == 0 && theNum2 / 10 == 0){
						switched = bins[endPrev] ^ endPrev2;	
					}else{
					switched = bins[endPrev] ^ bins[endPrev2];					
					}
					count+= hamming(switched);
					//System.out.println(hamming(switched));
					prevNum2 /= 10;
					theNum2 /= 10;
				}
			}
			prevNum = theNum;
			theNum = digsum;
		}
		
		count+= hamming(bins[theNum]);
	
		//System.out.println(theNum);
		}
		System.out.println(count);
		System.out.println(otherCount - count);
		
		
		
		
	/*	try{
		FileWriter fileWriter = new FileWriter("newprimes.txt");
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		ArrayList<String> lines = new ArrayList<String>();
		lines = fileReader.readMyFile("primes1.txt");
		
		ArrayList<Integer> ints = new ArrayList<Integer>();
		for(int i = 0; i < lines.size(); i++){
			String[] hargh = lines.get(i).split("\\s+");
			for(String u : hargh){
				if(u.length() >= 1){
					int num = Integer.parseInt(u);
					if(num > Math.pow(10, 7)){
						ints.add(num);
						System.out.println(num);
						bufferedWriter.write(u + " ");
					}
				}
			}
		}
		
		ArrayList<String> lines2 = new ArrayList<String>();
		lines2 = fileReader.readMyFile("primes2.txt");
		for(int i = 0; i < lines2.size(); i++){
			String[] hargh = lines2.get(i).split("\\s+");
			for(String u : hargh){
				if(u.length() >= 1){
					int num = Integer.parseInt(u);
					if(num > Math.pow(10, 7) && num < 2 * Math.pow(10,7)){
						ints.add(num);
						System.out.println(num);
						bufferedWriter.write(u + " ");
					}
				}
			}
		}
		
		
			bufferedWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}*/
}
	public static int digSum(int a){
		int count = 0;
		int theA;
		while(a > 0){
		count += a % 10;
		a /= 10;
		}
		return count;
	}

	public static long hamming(int u){ //get sum of 1's
		int count = 0;
		while( u > 0){
			count = count + 1;
			u = u & (u - 1);
		}
		return count;
	}
}

	
