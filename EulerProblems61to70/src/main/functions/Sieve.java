package main.functions;

import java.util.ArrayList;

public class Sieve {
	public static void run(){
		ArrayList<Long> ints = new ArrayList<Long>();
		for(long i = 0; i < Math.pow(10, 7); i++){
			ints.add(i);
		}
	
		
		for(long i = 2; i < ints.size();i++){
			long u = ints.get((int) i);
		
			if(u != 0){
				System.out.println(Long.toString(u));
				for(long j = 2 * u; j < ints.size(); j += u){
					ints.set((int) j, (long) 0);
				}
			}
		}
		ArrayList<Long> primes = new ArrayList<Long>();
		for(long k : ints){
			if(k != 0 && k != 1){
				primes.add(k);
			}
		}
		ArrayList<String> primeWords = new ArrayList<String>();
		for(long i : primes){
			primeWords.add(Long.toString(i));
		}
		MyFileWriter bro = new MyFileWriter();
		String typename = "primes.txt";
		bro.groupWriter(primeWords, typename);
	}
}
