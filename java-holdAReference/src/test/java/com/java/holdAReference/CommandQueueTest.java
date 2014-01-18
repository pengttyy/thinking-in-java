package com.java.holdAReference;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Queue;

import org.junit.Before;
import org.junit.Test;

public class CommandQueueTest {
    private CommandQueue cq;
    private Queue<Command> queue;
	@Before
	public void setUp() throws Exception {
		cq = new CommandQueue();
		queue = cq.getQueue();
	}

	@Test
	public void test() {
		while(queue.size()>0){
			Command command = queue.poll(); 
		    command.operation();
		} 
	}
	
	
	@Test
	public void testString() {
		String str = "pengkai";
	    str = str.concat("kai");
	    System.out.println(str);
	}

}
  