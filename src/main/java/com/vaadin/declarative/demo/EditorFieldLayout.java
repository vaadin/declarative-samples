package com.vaadin.declarative.demo;

import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

/**
 * Editor field that is used in NestedDesignsLayout
 * Created by Vaadin Ltd / mjhosio on 30/03/15.
 */
@DesignRoot
public class EditorFieldLayout extends VerticalLayout {

	protected TextField itemField;
	protected TextField quantityField;
	protected TextField priceField;

	protected Button cancelButton;
	protected Button saveButton;

	public EditorFieldLayout(){
		Design.read(this);
	}
}
