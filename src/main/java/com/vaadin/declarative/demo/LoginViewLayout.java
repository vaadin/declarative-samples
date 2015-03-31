package com.vaadin.declarative.demo;

import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

/**
 * Created by Vaadin Ltd / mjhosio on 27/03/15.
 */
@DesignRoot
public class LoginViewLayout extends VerticalLayout{

	public TextField emailField;
	public PasswordField passwordField;
	public Button signInButton;

	public LoginViewLayout(){
		Design.read(this);
	}
}
