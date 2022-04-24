package com.gl.javafsd.ds3.generics;

//public class Money {

public class Money {

	private int amount;
	
	public Money(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public String toString() {
		return "The amount that is being held is -> " + amount;
	}
}
