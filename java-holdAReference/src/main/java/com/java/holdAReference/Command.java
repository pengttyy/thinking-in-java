package com.java.holdAReference;

public class Command {
   private String str;
   public Command(String str){
	   this.str = str;
   }
   public void operation(){
	   System.out.println(str);
   }
}
