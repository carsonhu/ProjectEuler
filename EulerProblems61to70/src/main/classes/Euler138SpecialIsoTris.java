package main.classes;

import java.util.ArrayList;

public class Euler138SpecialIsoTris {
	public static void run(){
		ArrayList<Long> nums = new ArrayList<Long>();
		
		for(long i = 2; i < Math.pow(10, 11); i++){
			if(nums.size() >= 12){
				break;
			}
			long h = 2 * i + 1;
			long j = 2 * i - 1;
			if(isPythag(i, j)){
				nums.add(pythag(i, j));
				System.out.println(pythag(i, j));
			}
			if(isPythag(i, h)){
				nums.add(pythag(i, h));
				System.out.println(pythag(i, h));
			}
			
		}
		long sum = 0;
		for(long i : nums){
			sum+= i;
		//	System.out.println(i);
		}
		System.out.println(sum);
	}
	public static boolean isPythag(long x, long y){
		long zSquared = x * x + y * y;
		long z = Math.round(Math.sqrt(zSquared));
		return (z * z == zSquared);
	}
	public static long pythag(long x, long y){
		long zSquared = x * x + y * y;
		return Math.round(Math.sqrt(zSquared));
	}
	
}
