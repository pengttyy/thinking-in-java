package com.pengttyy.study.java_rtti.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {
    private Object object;
    
    public ProxyHandler(Object object){
    	this.object = object;
    }
    
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("========================= proxy="+proxy.getClass().getName());
		System.out.println("========================= method="+method.getName());
		System.out.println("========================= args="+args);
		getClassName(proxy.getClass());
		this.before();
		Object obj = method.invoke(object, args);
		this.after();
		return obj;
	}
	
	public void getClassName(Class clazz){
		System.out.println(clazz.getName());
		if(Object.class!=clazz){
			getClassName(clazz.getSuperclass());
		}
	}
	
	private void before(){
		System.out.println("method before");
	}
	
	private void after(){
		System.out.println("method after");
	}

}
