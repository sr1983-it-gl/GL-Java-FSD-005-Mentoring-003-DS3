package com.gl.javafsd.ds3.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Pre-defined -> Integer, Float, Boolean
// User-defined data-types

public class WithGenericsDemo {

	
	public static void main(String[] args) {
		
//		strList();
//		intList();
		moneyList();
	}
	
	private static void strList() {
		// String objects
		List<String> myFavColors = new ArrayList();
		
		myFavColors.add("Blue");
		myFavColors.add("Green");
		myFavColors.add("Red");
		
//		myFavColors.add(1);
		
		myFavColors.add("Violet");
		
//		myFavColors.add(Boolean.TRUE);
		
		for (String myFavColor : myFavColors) {
			System.out.println(myFavColor);
		}
	}
	
	private static void intList() {
		
		List<Integer> evenNumbers = new ArrayList<>();
		
		evenNumbers.add(10);
		evenNumbers.add(20);
		evenNumbers.add(30);
		
//		evenNumbers.add("hello");
	}
	
	private static void test() {
		
		Set<Integer> set = new HashSet<>();
		
		Map<String, Integer> map = new HashMap<>();
		
		
	}
	
	private static void moneyList() {

		List<Money> moneyList = new ArrayList<>();
		
		Money m1 = new Money(1);		
		moneyList.add(m1);
		
		Money m2 = new Money(100);
		moneyList.add(m2);
		
		for (Money moneyObj : moneyList) {
//			System.out.println(moneyObj);
			System.out.println(moneyObj.toString());

		}

//		moneyList.add(10);
//		moneyList.add("100");
	}
	
	private static void pairList() {
		
		List<Pair<Integer, Integer>> intPairList = new ArrayList<>();
		
		intPairList.add(new Pair<Integer, Integer>(10, 20));
		intPairList.add(new Pair<Integer, Integer>(30, 40));
		
		
		List<Pair<String, String>> strPairList = new ArrayList<>();
		strPairList.add(new Pair<String, String>("low", "high"));
		
		List allInclusivePairList = new ArrayList<>();
		
		allInclusivePairList.add(new Pair(10, 20));
		allInclusivePairList.add(new Pair("morning", "evening"));		
	}
}
