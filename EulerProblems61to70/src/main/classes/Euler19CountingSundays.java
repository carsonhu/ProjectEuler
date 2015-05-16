package main.classes;

public class Euler19CountingSundays {
	public static void run(){
		int firstSun = 6;
	//	int currentYear = 1;
		int leapBonus = 0;
		int totalCount = 0;
		for(int currentYear = 1; currentYear <=100; currentYear ++){
			if(currentYear % 4 == 0){
				leapBonus = 1;
			}else{
				leapBonus = 0;
			}
		int janSun = 1;
		int febSun = 32;
		int marSun = 60 + leapBonus;
		int aprilSun = 91 + leapBonus;
		int maySun = 121 + leapBonus;
		int juneSun = 152 + leapBonus;
		int julySun = 182 + leapBonus;
		int augSun = 213 + leapBonus;
		int sepSun = 244 + leapBonus;
		int octSun = 274 + leapBonus;
		int novSun = 305 + leapBonus;
		int decSun = 335 + leapBonus;
		
		while(firstSun < 365 + leapBonus){
			if(firstSun == janSun || firstSun == febSun || firstSun == marSun || firstSun == aprilSun || firstSun == maySun || firstSun == juneSun || firstSun == julySun
					|| firstSun == augSun || firstSun == sepSun || firstSun == octSun || firstSun == novSun || firstSun == decSun){
				totalCount++;
			}
			firstSun+=7;
		}
		firstSun%= 365 + leapBonus;
		
		}
		System.out.println(totalCount);
	}
}
