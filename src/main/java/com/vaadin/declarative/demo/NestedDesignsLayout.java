package com.vaadin.declarative.demo;

import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Grid;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

/**
 * Created by Vaadin Ltd / mjhosio on 30/03/15.
 */
@DesignRoot
public class NestedDesignsLayout extends VerticalLayout{

	public EditorFieldLayout editor;
	public Grid grid;

	public NestedDesignsLayout(){
		Design.read(this);
	}
}
