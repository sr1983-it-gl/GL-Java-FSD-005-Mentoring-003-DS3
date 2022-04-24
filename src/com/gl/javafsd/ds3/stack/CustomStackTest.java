package com.gl.javafsd.ds3.stack;

import java.util.EmptyStackException;
import java.util.Stack;

import com.gl.javafsd.ds3.generics.Book;

public class CustomStackTest {

	static CustomStack<String> myBooksCupbboard = new CustomStack();
		
	public static void main(String[] args) {
		
		push();
		display();
		
		pop();
		display();
		
		pop();
		display();
		
		push(new String[] {
			"My First Java FSD Cookbook",
			"Introduction to Big Data and AI"
		});
		display();
		
		pop();
		display();
	}
	
	private static void push() {
		
		myBooksCupbboard.push("Harry Potter Series");
		myBooksCupbboard.push("How to become a Film Director");
		myBooksCupbboard.push("Interstellar - Journey around space & time");		
	}
	
	private static void push(String[] newBooks) {
		
		for (String newBook : newBooks) {			
			myBooksCupbboard.push(newBook);
		}
	}
	
	private static void  display() {
		
		System.out.println("----------------------------------");
		
		for (int index = (myBooksCupbboard.size() - 1); index >=0; index --) {
			
			String book = myBooksCupbboard.get(index);
			
			System.out.print(book);
			
			if (index != 0) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}
	
	private static void pop() {
		
		String removedBook = null;
		
		try {
			removedBook = myBooksCupbboard.pop();
			System.out.println("Book [" + removedBook 
				+ "] taken out from the shelf..");
		}catch (EmptyStackException e) {
			e.printStackTrace();
		}		
	}	
}
