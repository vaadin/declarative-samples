package com.vaadin.declarative.demo;

import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Grid;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

/**
 * Design that uses another design (EditorFieldLayout)
 * Created by Vaadin Ltd / mjhosio on 30/03/15.
 */
@DesignRoot
public class NestedDesignsLayout extends VerticalLayout{

	protected EditorFieldLayout editor;
	protected Grid grid;

	public NestedDesignsLayout(){
		Design.read(this);
	}
}
