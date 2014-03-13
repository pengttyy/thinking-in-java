package com.pengttyy.tapestry.pages;

import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.OnEvent;

public class Start {
    @InjectPage
	private  Another anotherPage;
	public String getGreeting(){
	   return "Hello Tapestry!";
   }
	
	@OnEvent(value = "action", component = "actionLink1")
	Object toAnotherPagex() {
		System.out.println("====xxxxxxxx==========");
	return "another";
	}
}