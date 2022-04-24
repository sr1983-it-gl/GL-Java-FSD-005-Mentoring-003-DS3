package com.gl.javafsd.ds3.generics;

import java.util.ArrayList;
import java.util.List;

public class WithoutGenerics {

	public static void main(String[] args) {
		
		List myFavColors = new ArrayList();
		
		// String
		myFavColors.add("Blue");
		myFavColors.add("Green");
		myFavColors.add("Red");
		
		// Integer
		myFavColors.add(1);
		
		// Float
		myFavColors.add(10.23);
		
		//Boolean
		myFavColors.add(Boolean.FALSE);
	}
}
