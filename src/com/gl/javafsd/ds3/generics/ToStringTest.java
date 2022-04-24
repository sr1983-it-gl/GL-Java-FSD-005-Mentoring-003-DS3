package com.gl.javafsd.ds3.generics;

public class ToStringTest {

	public static void main(String[] args) {
		
		// Pre-defined data-types
		Integer i = new Integer(100);
		
		Integer i2 = Integer.valueOf(100);
		
		System.out.println(i);
		
		Float f1 = new Float(10.22);
		System.out.println(f1);
		
		// User-defined / Custom data type
		Money m1 = new Money(1000);		
		System.out.println(m1);
	}
}
