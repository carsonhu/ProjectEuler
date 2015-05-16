package main.admin;

import static java.lang.System.out;
//import pset.one.*;
//import pset.two.*;
//import pset.three.*;
//import pset.four.*;
//import pset.five.*;
//import pset.six.*;
import main.classes.*;
import main.functions.Sieve;

public class Main {
	public static void main(String[] args) {
		long startTime = System.nanoTime();      //Time start
	//	Euler59XORDecryption.run();
	//Euler20FactorialDigitSum.run();
	//	Euler67MaxPathSum2.run();
	//	Euler97LargePrime.run();
	//	Euler20FactorialDigitSum.run();
	//	Euler19CountingSundays.run();
	//	Euler92SquareDigitChains.run();
	//	Euler102TriangleContainment.run();
	//	Euler145ReversibleNumbers.run();
	//	Euler112BouncyNumbers.run();
	//	Euler179ConsecutiveDivisors.run();
	//	Euler187Semiprimes.run();
	//	Euler297Zeckendorf.run();
	//	Euler206ConcealedSquare.run();
	//	Euler125PalindromicSums.run();
	//	Sieve.run();
	//Euler188Hyperexponentiation.run();
	//	Euler60PrimePairSets.run();
	//	Euler119DigitPowerSum.run();
	//	Euler86CuboidRoute.run();
	//	Euler74DigitFactorialChains.run();
	//	Euler25Fibonacci.run();
	//	Euler63PowerfulDigitCounts.run();
	//	Euler75IntegerRightTriangles.run();
	//	Euler203SquarefreeBinomial.run();
	//	Euler173Laminae.run();
	//	Euler81PathSum2Ways.run();
	//	Euler204HammingNumbers.run();
	//	Euler138SpecialIsoTris.run();
	//	Euler243Resilience.run();
	//	Euler85CountingRectangles.run();
	//	Euler108DiophantineReciprocals.run();
	//	Euler69TotientMaximum.run();
	//	Euler38PandigitalMultiples.run();
	//	Euler54PokerHands.run();
	//	Euler45TriPentHex.run();
	//	Euler62CubicPermutations.run();
	//	Euler104PandigitalFibonacci.run();
	//	Euler68GonRing.run();
	//	Euler95AmicableChainsB.run();
	//	Euler66DiophantineEquation.run();
	//	Euler91RightTriangles.run();
	//	Euler100ArrangedProbability.run();
	//	Euler87PrimePowerTriples.run();
	//	Euler31CoinSum.run();
	//	Euler56PowerfulDigitSum.run();
	//	Euler57SquareRootConvergents.run();
	//	Euler65ConvergentsOfE.run();
	//	Euler124OrderedRadicals.run();
	//	Euler120SquareRemainders.run();
	//	Euler123PrimeSquareRemainders.run();
	//	Euler94AlmostEquilateral.run();
	//	Euler357PrimeGeneratingIntegers.run();
	//	Euler71OrderedFractions.run();
	//	Euler205DiceGame.run();
	//	Euler76CountingSummations.run();
	//	Euler77PrimeSummations.run();
	Euler59XORDecryption.run();
		//	Euler78CoinPartitions.run();
	//	Euler116RGBTiles.run();
	//	Euler80DigitalExpansion.run();
	//	Euler99LargestExponential.run();
	//	Euler144LaserReflections.run();
	//	Euler315DigitalRootClocks.run();
		long endTime = System.nanoTime();        //Time end
		timer(startTime, endTime);
	}
	private static void timer(long start, long finish){
		
		long timeTaken = finish - start;
		String timeFormatted = "0.";
		int count = String.valueOf(timeTaken).length();
		for(int i = 9-count; i>0; i--){
			timeFormatted += "0";
		}
		timeFormatted += String.valueOf(timeTaken);
		out.println("\n" + timeFormatted + " seconds taken to complete calculations.");
	}
}
