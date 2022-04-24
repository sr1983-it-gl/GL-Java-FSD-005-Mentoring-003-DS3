package com.gl.javafsd.ds3.generics;

public class PairDemo {

	public static void main(String[] args) {
		
		withoutGenericsPairTest();
		
		withGenericsPairTest();
	}
	
	private static void withoutGenericsPairTest() {
		
		// (10 - 100)
		// (25 - 35)
		
		IntegerPair agePair = new IntegerPair(20, 30);
		System.out.println(agePair.toString());
		
		StringPair lowHigh = new StringPair("low", "high");
		System.out.println(lowHigh.toString());
		
		StringPair dayNight = new StringPair("day", "night");
		System.out.println(dayNight.toString());
				
		// Problem
		// For every data type, a brand new class to be created.
		
	}
	
	private static void withGenericsPairTest() {
		
		Pair<Integer, Integer> agePair = new Pair(20, 30);
		System.out.println(agePair.toString());
		
		Pair<String, String> lowHigh = new Pair("Low", "High");
		System.out.println(lowHigh.toString());
		
	}
}
