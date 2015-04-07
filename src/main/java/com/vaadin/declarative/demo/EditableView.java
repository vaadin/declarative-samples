package com.vaadin.declarative.demo;

import com.vaadin.ui.declarative.Design;

import java.io.ByteArrayInputStream;

/**
 * View sample that allows editing of the layout on the fly
 * Created by Vaadin Ltd / mjhosio on 07/04/15.
 */
public class EditableView extends EditableSampleView{

	protected LoginViewLayout loginForm;

	public EditableView() {
		super("LoginViewLayout.html");
		loginForm =new LoginViewLayout();
		setFirstComponent(loginForm);
	}
	@Override
	protected void updateLayout() {
		try{
			loginForm.removeAllComponents();
			Design.read(new ByteArrayInputStream(editor.getValue().getBytes()), loginForm);
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
