package com.pengttyy.tapestry.pages;

import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.corelib.components.PageLink;

public class Another {
    @Component(parameters={"page=start"})
	private PageLink goToStart;
}
