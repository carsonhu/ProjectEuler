package main.functions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class EulerFunctions {

	/*public static long totient(long n){
		List<Long> factors = slightlyEfficientFactorization(n);
		List<Long> uniqueFactors = new ArrayList<Long>();
		for(long i : factors){
			if(!uniqueFactors.contains(i)){
				uniqueFactors.add(i);
			}
		}
		
		long max = n;
		for(long i : uniqueFactors){
			long curr = i;
			while(curr < n){
				
			}
		}
		
	}*/
	
	public static List<Long> slightlyEfficientFactorization(long n){
		  List<Long> factors = new ArrayList<Long>();
		    while (n % 2 == 0 && n > 0) {
		        factors.add(2L);
		        n /= 2;
		    }

		    for (long i = 3; i * i <= n; i+=2) {
		        while (n % i == 0) {
		            factors.add(i);
		            n /= i;
		        }
		    }
		    if (n > 1)
		        factors.add(n);

		    return factors;
	}
	
	public static ArrayList<long[]> pascal(){
		ArrayList<long[]> triangle = new ArrayList<long[]>();
		for(int len = 1; len <= 51; len++){
			long[] row = new long[len];
			row[0] = 1;
			row[len - 1] = 1;
			if(len > 2){
				for(int i = 1; i < row.length - 1; i++){
					row[i] = triangle.get(len - 2)[i - 1] + triangle.get(len - 2)[i];
				}
			}
			triangle.add(row);
		}
		return triangle;
	}
	
	
	public static boolean isPalindromic(long sum){
		if(sum < 10){
			return true;
		}else{
			String theNum = Long.toString(sum);
			
			for(int i = 0; i <= theNum.length() / 2; i++){
				if(theNum.charAt(i) != theNum.charAt(theNum.length() - 1 - i)){
					return false;
				}
			}
			return true;
		}
	}
	
	public static ArrayList<int[]> euclid(){
		int max=  150000000;
	
		ArrayList<int[]> nums = new ArrayList<int[]>();
			for(int m = 2; m < max; m++){
				for(int n = 1; n < m; n++){
					if((m - n) % 2 == 1){ //and gcd = 1; make sure toadd that
						
						int a = (int) ((Math.pow(m, 2) - Math.pow(n, 2)));
						int b = 2  * m * n;
						int c = (int) ((Math.pow(m, 2) + Math.pow(n, 2)));
						if(a + b + c <= max){
							nums.add(new int[]{a, b, c});
						}else{
							n = m;
							
						}
					}
				}
			}
			
		
		return nums;
	}
	
	public static double hcf(int first, int second){
		
		
		return 0;
		
	}
	
	public static ArrayList<Integer> primeFact(int num){
		ArrayList<Integer> primes = new ArrayList<Integer>();
		ArrayList<Integer> primeFact = new ArrayList<Integer>();
		for(int i = 1; i < num; i++){
			if(isPrime(i)){
				primes.add(i);
			}
		}
		int n = num;
		while(n >= 1){
			for(int i : primes){
				if(n / i == (double) n / (double) i){
					primeFact.add(i);
					n /= i;
					break;
				}
			}
		}
		return primeFact;
	}
	
	
	public static boolean isPrime(double aNumber){
		if(aNumber != (int) aNumber){
			return false;
		}
		
		if(aNumber <= 1){
			return false;
		}
		if(aNumber == 2){
			return true;
		}
		if(aNumber / 2 == Math.floor(aNumber / 2)){
			return false;
		}
		
		for(double i = 3; i <= Math.sqrt(aNumber); i = i +2){
			if(aNumber / i == Math.floor(aNumber / i )){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isTriangular(double number){
		double n = number * 2;
		for(int i = 1; i < n; i++){
			if(i * (i + 1) == n){
				return true;
			}
		}
		return false;
	}
	
	public static int findPartialScore(String name){
		int tempSum = 0;
		for(int i = 0; i < name.length(); i++){
			char tempChar = name.charAt(i);
			tempSum += Character.getNumericValue(tempChar) - 9;
		}
		return tempSum;
	}
	
	public static boolean isPentagonal(double number){
		double n = number * 2;
		for(int i = 1; i < n; i++){
			if(i * (3*i - 1) == n){
				return true;
			}
		}
		return false;
	}
	
	public static boolean isHexagonal(double number){
		double n = number;
		for(double i = 1; i < n; i++){
			if(i * (2*i - 1) == n){
				return true;
			}
		}
		return false;
	}
	
	public static long numDivisors(double aNumber){ //find number of divisors
		int divisors = 0;
		for(int i = 1; i <= Math.sqrt(aNumber); i++){ 
			if(aNumber / i == Math.floor(aNumber / i)){
				if(i != aNumber / i){
				divisors = divisors + 2;
				}else{
					divisors = divisors + 1;
				}
			}
		}
		return divisors;
	}
	
	public static ArrayList<Integer> findDivisors(double aNumber){ //find divisors
		ArrayList<Integer> ints = new ArrayList<Integer>();
		for(int i = 2; i <= Math.sqrt(aNumber); i++){ 
			if(aNumber / i == Math.floor(aNumber / i)){
				ints.add(i);
				if(i != aNumber / i){
				ints.add((int)aNumber / i);
				}
			}
		}
		ints.add((int) aNumber);
		return ints;
	}
	
	public  static void permutation(String str, ArrayList<String> ints) { 
	    permutation("", str, ints); 
	}

	private static void permutation(String prefix, String str, ArrayList<String> ints) {
	    int n = str.length();
	    if (n == 0 && !ints.contains(prefix)){
	    	ints.add(prefix);
	    	System.out.println(prefix);}
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), ints);
	    }
	}
	
	public static void printPermutations(int[] n, int[] Nr, int idx) {
	    if (idx == n.length) {  //stop condition for the recursion [base clause]
	        System.out.println(Arrays.toString(n));
	        return;
	    }
	    for (int i = 0; i <= Nr[idx]; i++) { 
	        n[idx] = i;
	        printPermutations(n, Nr, idx+1); //recursive invokation, for next elements
	    }
	}
	public static boolean allEqual(Object... objs) {
	    if(objs.length < 2) return true; // 0 or 1 objects are all equal
	    Object key = objs[0]; // pick one
	    for(Object o : objs) if(!o.equals(key)) return false;
	    return true;
	}
	
	public static ArrayList<Integer> primitiveMultiplication(ArrayList<Integer> oldDigits, int secondNumber){
		int carryOver = 0;
		boolean nextCarryOver = false;
	ArrayList<Integer> digits = new ArrayList<Integer>();
	for(int b = 0; b < oldDigits.size(); b++){
		digits.add(oldDigits.get(b));
	}
	for(int w = 1; w < secondNumber; w++){
		for(int i = oldDigits.size() - 1; i>= 0; i--){
			int doubledNumber = oldDigits.get(i) + digits.get(i);
			int roubledNumber = doubledNumber;
			if(doubledNumber >= 10){
				nextCarryOver = true;
				doubledNumber %= 10;
			}else{
				nextCarryOver = false;
			}
			digits.set(i, doubledNumber + carryOver);
			if(0 == digits.indexOf(digits.get(i)) && nextCarryOver == true){
				digits.add(0, 1);
				i=-99;
			}
			if(nextCarryOver == true){
				carryOver = roubledNumber / 10;
			}else{
				carryOver = 0;
			}
		}
	}
	return digits;
	}
	
	public static long reverseDigits(long n){
		long tempN = n;
		String yolo = "";
		while(tempN > 0){
			yolo+= tempN % 10;
			tempN /= 10;
			}
		return Long.parseLong(yolo);
		}
	
	public static boolean isIncreasing(int n){
		String theInt = Integer.toString(n);
		for(int i = 0; i < theInt.length()- 1; i++){
			int num1 = Integer.parseInt(theInt.substring(i, i + 1));
			int num2 = Integer.parseInt(theInt.substring(i+1, i + 2));
			if(num1 > num2){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isDecreasing(int n){
		String theInt = Integer.toString(n);
		for(int i = 0; i < theInt.length()- 1; i++){
			int num1 = Integer.parseInt(theInt.substring(i, i + 1));
			int num2 = Integer.parseInt(theInt.substring(i+1, i + 2));
			if(num1 < num2){
				return false;
			}
		}
		return true;
	}
	
	public static ArrayList<Integer> primitiveAdding(ArrayList<Integer> digits){ //primitive way to find digits in 2^1000
		int carryOver = 0;
		boolean nextCarryOver = false;
		for(int i = digits.size() - 1; i >=0; i--){
			int doubledNumber = 2 * digits.get(i);
			int roubledNumber = doubledNumber;
			if(doubledNumber >= 10){
				nextCarryOver = true;
				doubledNumber %= 10;
			}else{
				nextCarryOver = false;
			}
			digits.set(i, doubledNumber + carryOver);
			if(i == 0 && nextCarryOver == true){
				digits.add(0, 1);
				i=-99;
			}
			if(nextCarryOver == true){
				carryOver = roubledNumber / 10;
			}else{
				carryOver = 0;
			}
		}
		return digits;
	}
	
}
