package com.vaadin.declarative.demo;

import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

/**
 * Design for login view
 * Created by Vaadin Ltd / mjhosio on 27/03/15.
 */
@DesignRoot
public class LoginViewLayout extends VerticalLayout{

	// these fields will be mapped based on _id attribute in the design
	protected TextField emailField;
	protected PasswordField passwordField;
	protected Button signInButton;

	public LoginViewLayout(){
		Design.read(this);
	}
}
