package com.java.holdAReference;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class Gerbil 
{
    private int gerbilNumber;
    public Gerbil(){
    	Random random = new Random(); 
    	this.gerbilNumber = random.nextInt(100); 
    }
	public String hop() {
		return "编号"+this.gerbilNumber+"正在跳动";
	}
}
