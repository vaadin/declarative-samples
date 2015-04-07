package com.vaadin.declarative.demo;

import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

/**
 * Layout that contains the intro label
 * Created by Vaadin Ltd / mjhosio on 07/04/15.
 */
@DesignRoot
public class DemoLayout extends VerticalLayout {

	public DemoLayout(){
		Design.read(this);
	}
}
