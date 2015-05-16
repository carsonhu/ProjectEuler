package main.functions;

import java.io.*;
import java.util.*;

/**
 * @author dh.chu
 *
 */
public class MyFileWriter {
	public MyFileWriter(){
	}
	public void groupWriter(ArrayList<String> stringList, String fileName){
		try {
			FileWriter fileWriter = new FileWriter(fileName);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		for(int i = 0; i < stringList.size(); i++){
			bufferedWriter.write(stringList.get(i) + "\n");
		}
			
			bufferedWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void singleWriter(String aString, String fileName){
		try{
			FileWriter fileWriter = new FileWriter(fileName);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(aString + "\n");
			bufferedWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void groupWriterr(ArrayList<ArrayList<Integer>> intList, String fileName){
		try {
			FileWriter fileWriter = new FileWriter(fileName);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
			for(ArrayList<Integer> u : intList){
				ArrayList<String> stringList = new ArrayList<String>();
				for(int v : u){
					stringList.add(Integer.toString(v));
				}
				for(int i = 0; i < stringList.size(); i++){
					bufferedWriter.write(stringList.get(i) + " ");
				}
				bufferedWriter.write("\n");
			}

			
			bufferedWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}