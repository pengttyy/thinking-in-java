package com.java.innerClass.java_innerClass.innerClass;
/**
 * 外围类可以访问内部类的私有属性，
 * 内部类可以修改外围类的属性
 * @author pengkaiPC
 *
 */
public class Contents {
   private String className = "Contents";
   
   private void testContents(){
	   System.out.println("testContents");
   }
   
   public class ContentsInner{
	   private String str = "123";
	   public void setClassName(){
		   System.out.println(className);
		   className = "ContentsInner";
		   testContents();
	   }
   }
   
   public ContentsInner getContents(){
	   return new ContentsInner();
   }
   
   public String getInnerStr(){
	   return new ContentsInner().str;
   }
}
