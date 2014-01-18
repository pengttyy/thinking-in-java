package com.pengttyy.annations.study.annotate;

import static org.junit.Assert.*;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import org.junit.Before;
import org.junit.Test;

public class CreateXMLTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		StringBuffer sb = new StringBuffer();
		Class<CreateXML> cls = CreateXML.class;
		boolean flag = cls.isAnnotationPresent(Xml.class);
		String rootName = "";
		if(flag){
			Xml xml = cls.getAnnotation(Xml.class);
			rootName = xml.nodeName();
			sb.append("<"+xml.nodeName()+">");
		}
		
		for (Field field : cls.getDeclaredFields()) {
			Xml xml = field.getAnnotation(Xml.class);
			sb.append("<"+xml.nodeName()+"/>");
		}
		
		sb.append("<"+rootName+"/>");
		System.out.println(sb.toString());
	}

}
