package com.gl.javafsd.ds3.stack;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

import com.gl.javafsd.ds3.generics.Book;

public class StackTest {
	
	static Stack<String> myBooksCupbboard = new Stack();
	
	static Stack<Book> myBookShelf = new Stack<>();
	
	public static void main(String[] args) {

		
		push();
		display();
		
		pop();
		display();
	}
	
	private static void push() {
		
		myBooksCupbboard.push("Harry Potter Series");
		myBooksCupbboard.push("How to become a Film Director");
		myBooksCupbboard.push("Interstellar - Journey around space & time");		
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
	
	private static void bookShelfTest() {

		Book harryPotter = new Book(
			"Harry Potter - Part I", "12345", "JK Rowling", 1998);
		
		myBookShelf.add(harryPotter);		
		
//		myBookShelf.add("Harry Potter - Part 2");
	}
}
