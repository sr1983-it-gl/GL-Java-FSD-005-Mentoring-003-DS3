package com.gl.javafsd.ds3.queue;

import java.awt.DisplayMode;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	private static Queue<String> peopleQueuePizza = new LinkedList<>();
	
	public static void main(String[] args) {
		
		// Enqueue / De-queue
		// Enqueue / Poll
		enqueue();		
		display();
		
		dequeue();
		display();
		
		dequeue();
	}
	
	private static void enqueue() {
		
		System.out.println("---------------------------------");

		peopleQueuePizza.add("Punith");
		peopleQueuePizza.add("Indrajith");
		peopleQueuePizza.add("Zaheer");
		peopleQueuePizza.add("Zeena");
		peopleQueuePizza.add("Alia");
		
	}
	
	private static void display() {
		
		Iterator<String> iterator = peopleQueuePizza.iterator();
		
		while (iterator.hasNext()) {
			
			String people = iterator.next();
			System.out.print(people);
			
			if (iterator.hasNext()) {
				System.out.print(", ");
			}
		}
		
		System.out.println();
	}
	
	private static void dequeue() {
		
		String personWhoGotServiced = peopleQueuePizza.poll();
		
		if (personWhoGotServiced != null) {
			System.out.println("Person [" + personWhoGotServiced + " had "
					+ "left the queue...");
		}else {
			System.out.println("Queue is empty");
		}
		
	}
}
