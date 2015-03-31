package com.vaadin.declarative.demo;

import com.vaadin.data.validator.EmailValidator;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;

/**
 * Created by Vaadin Ltd / mjhosio on 30/03/15.
 */
public class LoginViewWithListeners extends LoginView {

	public LoginViewWithListeners(){
		super();
		addValidators();
		addLoginButtonListener();
	}

	private void addValidators() {
		this.loginForm.emailField.addValidator(new EmailValidator("Input valid email"));
	}

	private void addLoginButtonListener() {
		this.loginForm.signInButton.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(Button.ClickEvent clickEvent) {
				performLogin();
			}
		});
	}

	private void performLogin() {
		String email=this.loginForm.emailField.getValue();
		String password=this.loginForm.passwordField.getValue();
		if(email.equals("demo@vaadin.com") && password.equals("demo")){
			Notification.show("SUCCESS");
		} else{
			Notification.show("Login failed. Try 'demo@vaadin.com / demo'");
		}
	}

	@Override
	public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {

	}

}
