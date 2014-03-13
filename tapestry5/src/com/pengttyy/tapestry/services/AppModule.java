package com.pengttyy.tapestry.services;

import org.apache.tapestry5.*;
import org.apache.tapestry5.ioc.MappedConfiguration;
public class AppModule
{
	public static void contributeApplicationDefaults( 
			 MappedConfiguration<String, String> configuration) { 
			 configuration.add(SymbolConstants.PRODUCTION_MODE, "false"); 
			 } 
}