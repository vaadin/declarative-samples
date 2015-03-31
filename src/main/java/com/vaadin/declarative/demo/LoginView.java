package com.vaadin.declarative.demo;

import com.vaadin.event.FieldEvents;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.declarative.Design;

import java.io.ByteArrayInputStream;

/**
 * Created by Vaadin Ltd / mjhosio on 27/03/15.
 */
public class LoginView extends SampleView{

	protected LoginViewLayout loginForm;

	public LoginView(){
		super("LoginViewLayout.html");
		loginForm =new LoginViewLayout();
		setFirstComponent(loginForm);
		// let's make the login form editable for demonstration purposes
		editor.addTextChangeListener(new FieldEvents.TextChangeListener() {
			@Override
			public void textChange(FieldEvents.TextChangeEvent textChangeEvent) {
				updateLoginView();
			}
		});
		setSizeFull();
	}

	@Override
	public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {

	}


	private void updateLoginView() {
		try{
			loginForm.removeAllComponents();
			Design.read(new ByteArrayInputStream(editor.getValue().getBytes()), loginForm);
		} catch(Exception e){
			e.printStackTrace();
		}
	}

}
