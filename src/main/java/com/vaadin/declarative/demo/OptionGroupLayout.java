package com.vaadin.declarative.demo;

import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.OptionGroup;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

/**
 * Design for option group
 * Created by Vaadin Ltd / mjhosio on 30/03/15.
 */
@DesignRoot
public class OptionGroupLayout extends VerticalLayout{

	public OptionGroup options;

	public OptionGroupLayout(){
		Design.read(this);
	}
}
