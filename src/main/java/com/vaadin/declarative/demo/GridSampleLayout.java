package com.vaadin.declarative.demo;

import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Grid;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

/**
 * Sample design that contains grid
 * Created by Vaadin Ltd / mjhosio on 30/03/15.
 */
@DesignRoot
public class GridSampleLayout extends VerticalLayout{

	public Grid grid;

	public GridSampleLayout(){
		Design.read(this);
	}

}
