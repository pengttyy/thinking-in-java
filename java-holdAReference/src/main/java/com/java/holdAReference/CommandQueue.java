package com.java.holdAReference;

import java.util.LinkedList;
import java.util.Queue;

public class CommandQueue {
	
	private Queue<Command> queue;
    
	public Queue<Command> getQueue() {
		return queue;
	}

	public CommandQueue(){
		queue = new LinkedList<Command>();
		for (int i = 0; i < 10; i++) {
			queue.offer(new Command("str"+i));
		}
	}
}
