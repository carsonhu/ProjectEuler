package main.classes;

import java.util.ArrayList;

import main.functions.MyFileReader;
import main.functions.Sort;

public class Euler54PokerHands {
	public static void run(){
		int winner = 0;
		MyFileReader myFileReader = new MyFileReader();
		ArrayList<String> poker = myFileReader.readMyFile("poker.txt");
		for(int i = 0; i < poker.size();i++){
			String[] splitLine = poker.get(i).split(" ");
			ArrayList<String> handOne = new ArrayList<String>();
			ArrayList<String> handTwo = new ArrayList<String>();
			for(int b = 0; b <= 4; b++){
				handOne.add(splitLine[b]);
			}
			for(int b = 5; b < splitLine.length; b++){
				handTwo.add(splitLine[b]);
			}
			int firstScore = determineScore(handOne);
			int secondScore = determineScore(handTwo);
			if(firstScore > secondScore){
				winner++;
			}else if(firstScore==secondScore){
				if(didP1win(handOne, handTwo)){
					winner++;
					for(String b : handOne){
						System.out.print(b + ".");
					}
					System.out.println("");
					for(String b : handTwo){
						System.out.print(b + " ");
					}
					System.out.println("");
					
				}
			}
			
			
		}	
		System.out.println(winner);
		}
		
	public static boolean didP1win(ArrayList<String> handOne, ArrayList<String> handTwo){
		ArrayList<Integer> firstHand = sortValues(handOne);
		ArrayList<Integer> secondHand = sortValues(handTwo);
		for(int d = firstHand.size() - 1; d >=0; d--){
			if(firstHand.get(d) > secondHand.get(d)){
				return true;
			}else if(firstHand.get(d) < secondHand.get(d)){
				return false;
			}
		}
		System.out.println("WTF");
		return true;
		
	}
	
	public static ArrayList<Integer> sortValues(ArrayList<String> hand){
		ArrayList<Integer> firstValues = new ArrayList<Integer>();
		for(int i = 0; i < hand.size(); i++){
			String cardValue = hand.get(i).substring(0, 1);
			int realCardValue = 0;
			if(cardValue.equals("T")){
				realCardValue = 10;
			}else if(cardValue.equals("J")){
				realCardValue = 11;
			}else if(cardValue.equals("Q")){
				realCardValue = 12;
			}else if(cardValue.equals("K")){
				realCardValue = 13;
			}else if(cardValue.equals("A")){
				realCardValue = 14;
			}else{
				realCardValue = Integer.parseInt(cardValue);
			}
			firstValues.add(realCardValue);
		}
		Sort<Integer> sorter = new Sort<Integer>();
		firstValues = sorter.sort(firstValues);
		return firstValues;
	}
	
		public static int determineScore(ArrayList<String> hand){
			ArrayList<Integer> firstValues = new ArrayList<Integer>();
			ArrayList<String> firstSuits = new ArrayList<String>();
			for(int i = 0; i < hand.size(); i++){
				String cardValue = hand.get(i).substring(0, 1);
				int realCardValue = 0;
				if(cardValue.equals("T")){
					realCardValue = 10;
				}else if(cardValue.equals("J")){
					realCardValue = 11;
				}else if(cardValue.equals("Q")){
					realCardValue = 12;
				}else if(cardValue.equals("K")){
					realCardValue = 13;
				}else if(cardValue.equals("A")){
					realCardValue = 14;
				}else{
					realCardValue = Integer.parseInt(cardValue);
				}
				firstValues.add(realCardValue);
				firstSuits.add(hand.get(i).substring(1, 2));
				
			}
			Sort<Integer> sorter = new Sort<Integer>();
			firstValues = sorter.sort(firstValues);
			boolean isFlush = isAFlush(firstSuits);
			boolean isStraight = isAStraight(firstValues);
			boolean isFourOfKind = isFourOfAKind(firstValues);
			boolean isTriple = false;
			boolean isFullHouse = false;
			String returned = isAFullHouse(firstValues);
			if(returned.equals("Full House")){
				isFullHouse = true;
			}else if(returned.equals("Triple")){
				isTriple = true;
			}
			
			boolean isDouble = false;;
			boolean isTwoPair = false;
			int returnedInt = countDoubles(firstValues);
			if(returnedInt == 1){
				isDouble = true;
			}else if(returnedInt == 2){
				isTwoPair = true;
			}
			
			int handScore = 0;
		
			
			if(isStraight && isFlush){
				handScore = 800;
			}
			if(isFourOfKind){
				handScore = 700;
			}
			if(isFullHouse){
				handScore = 600;
			}
			if(isFlush && !isFullHouse && !isFourOfKind && !isStraight){
				handScore = 500;
			}
			if(isStraight && !isFlush){
				handScore = 400;
			}
			if(isTriple && !isFlush && !isFullHouse){
				handScore = 300;
			}
			if(isTwoPair && !isFlush){
				handScore = 200;
			}
			if(isDouble && !isFlush && !isFullHouse){
				handScore = 100;
			}
			return handScore;
		}
		
	
	
	public static int countDoubles(ArrayList<Integer> values){
		int numDoubles = 0;
		for(int i = 2; i <=14;i++){
			int counter = 0;
			for(int p = 0; p < values.size();p++){
				if(values.get(p) == i){
					counter++;
				}
			}
			if(counter == 2){
				numDoubles++;
			}
		}
		return numDoubles;
	}
	
	public static String isAFullHouse(ArrayList<Integer> values){ //check for full house and triple
		boolean aTriple = false;
		boolean aDouble = false;
		for(int i = 2; i <=14;i++){
			int counter = 0;
			for(int p = 0; p < values.size();p++){
				if(values.get(p) == i){
					counter++;
				}
			}
			if(counter == 3){
				aTriple = true;
			}
			if(counter == 2){
				aDouble = true;
			}
		}
		if(aTriple && aDouble){
			return "Full House";
		}else if(aTriple && !aDouble){
		return "Triple";
		}else{
			return "no";
	}
		}
	
	
	public static boolean isFourOfAKind(ArrayList<Integer> values){
		
		for(int i = 2; i <=14;i++){
			int counter = 0;
			for(int p = 0; p < values.size();p++){
				if(values.get(p) == i){
					counter++;
				}
			}
			if(counter == 4){
				return true;
			}
		}
		return false;
	}
	

	public static boolean isAFlush(ArrayList<String> firstSuits){
		String theSuit = firstSuits.get(0);
		for(int p = 0; p < firstSuits.size(); p++){ //check for flush; 
			if(firstSuits.get(p) != theSuit){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isAStraight(ArrayList<Integer> firstValues){
		int theValue = firstValues.get(0);
		for(int p = 0; p < firstValues.size();p++){ //check for straight
			if(firstValues.get(p) != theValue + p){
				return false;
			}
		}
		return true;
	}
	

}
