package com.java.innerClass.java_innerClass.innerClass;

import com.java.innerClass.java_innerClass.interfaces.Destination;

public class PPDestination extends PDestination {
    public Destination getDestination(){
    	return new DestinationImp();
    }
}
