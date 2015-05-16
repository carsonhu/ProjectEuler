package main.classes;

import java.util.ArrayList;
import java.util.Arrays;

import main.functions.EulerFunctions;
import main.functions.MyFileWriter;
import main.functions.Sort;

public class Euler68GonRing {
	static ArrayList<ArrayList<Integer>> theInts2 = new ArrayList<ArrayList<Integer>>();
	
	public static void run(){
		//ArrayList<String> theInts = new ArrayList<String>();
		ArrayList<Integer> theInts = new ArrayList<Integer>();
		
		//String str = "1234567890";
		perm2(theInts);
		//EulerFunctions.permutation(str, theInts);
		MyFileWriter writeFiler = new MyFileWriter();

	//	writeFiler.groupWriter(theInts, "gonring.txt");
		
		ArrayList<String> strungs = new ArrayList<String>();
		
	/*	//{0, 1, 4} {2, 4, 7} {8, 7, 6} {9, 6, 3} {5, 3, 1}
		for(int i = 0; i < theInts2.size(); i++){
			ArrayList<Integer> cool = theInts2.get(i);
			int sum1 = cool.get(0) + cool.get(1) + cool.get(4);
			int sum2 = cool.get(2) + cool.get(4) + cool.get(7);
			int sum3 = cool.get(8) + cool.get(7) + cool.get(6);
			int sum4 = cool.get(9) + cool.get(6) + cool.get(3);
			int sum5 = cool.get(5) + cool.get(3) + cool.get(1);
			
			if(EulerFunctions.allEqual(sum1, sum2, sum3, sum4, sum5)){
				String newString = Integer.toString(sum1) + Integer.toString(sum2) + Integer.toString(sum3) + Integer.toString(sum4) + Integer.toString(sum5);
				if(newString.length() == 16){
				strungs.add(newString);
				}
			}
		}
		
		Sort sorter = new Sort();
		strungs = sorter.sort(strungs);
		System.out.println(strungs.get(0));
		System.out.println(strungs.get(strungs.size() - 1));
		*/
	}
	public static void perm2(ArrayList<Integer> a) {
        ArrayList<Integer> sub = new ArrayList<Integer>();
        perm2(sub, a);
    }

 public static void perm2(ArrayList<Integer> sub, ArrayList<Integer> a) {
     int L = a.size();
     if (L == 0) {System.out.println(sub);
     theInts2.add(sub);}
     else {
    		 
         System.out.println(sub);
    	 
         for (int i = 0; i < L; i++) {
             ArrayList<Integer> ab = new ArrayList<Integer>(sub);
             ab.add(a.get(i));
             ArrayList<Integer> bc = new ArrayList<Integer>(a);
             bc.remove(i);
             perm2(ab, bc);
         }
     }
 }
}
