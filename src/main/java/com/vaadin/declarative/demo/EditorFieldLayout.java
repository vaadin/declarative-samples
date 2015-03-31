package com.vaadin.declarative.demo;

import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

/**
 * Created by Vaadin Ltd / mjhosio on 30/03/15.
 */
@DesignRoot
public class EditorFieldLayout extends VerticalLayout {

	public TextField itemField;
	public TextField quantityField;
	public TextField priceField;

	public Button cancelButton;
	public Button saveButton;

	public EditorFieldLayout(){
		Design.read(this);
	}
}
