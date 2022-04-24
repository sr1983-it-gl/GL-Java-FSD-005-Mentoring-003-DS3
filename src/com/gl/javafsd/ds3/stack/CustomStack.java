package com.gl.javafsd.ds3.stack;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class CustomStack<DT> {

	private Queue<DT> queue;
	
	public CustomStack() {
		queue = new LinkedList<>();
	}
	
	public void push(DT data) {
		
		int size = queue.size();

		queue.add(data);

		if (size == 0) {
			
			// Addition / Push of the first element			
		}else {
						
			for (int index = 0; index < size; index ++) {
				
				DT elementThatHasBeenRemoved = queue.remove();
				queue.add(elementThatHasBeenRemoved);
			}
		}
	}
	
	public DT pop() {
		
		if (queue.isEmpty()) {
			return null;
		}
		
		return queue.remove();
	}
	
	public int size() {
		
		return queue.size();
	}
	
	public DT get(int index) {
		
		Iterator<DT> iterator = queue.iterator();
		
		int counter = 0;
		while (iterator.hasNext()) {
			
			DT element = iterator.next();
			
			if (index == counter) {
				
				// Match
				return element;
			}			
			counter ++;
		}
		
		return null;
	}
	
	public DT top() {
		
		if (queue.isEmpty()) {
			return null;
		}
		
		return queue.peek();		
	}
}
