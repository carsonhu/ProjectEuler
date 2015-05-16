package main.classes;

import java.util.ArrayList;

import main.functions.MyFileReader;

public class Euler98Sudoku {
	public static void run(){
		MyFileReader fileReader = new MyFileReader();
		ArrayList<String> strings = fileReader.readMyFile("sudoku.txt");
		
	}
}
