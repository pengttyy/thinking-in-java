package com.pengttyy.study.java_rtti.proxy;

import java.lang.reflect.Proxy;

public class ProxyTest {
   public static void main(String[] args) {
	  long begintime =System.currentTimeMillis();
	  Inteface2 inteface = (Inteface2)Proxy.newProxyInstance(Inteface.class.getClassLoader(), new Class[]{Inteface.class,Inteface2.class}, new ProxyHandler(new IntefaceImp2()));
	  inteface.run2();
	  long endtime = System.currentTimeMillis();
	  System.out.println(endtime-begintime); 
   }
}
