package com.vaadin.declarative.demo;

import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.declarative.Design;

import java.io.ByteArrayInputStream;

/**
 * View for option group sample
 * Created by Vaadin Ltd / mjhosio on 30/03/15.
 */
public class OptionGroupView extends EditableSampleView {

	private OptionGroupLayout layout;

	public OptionGroupView(){
		super("OptionGroupLayout.html");
		layout=new OptionGroupLayout();
		setFirstComponent(layout);
	}

	@Override
	public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {

	}

	@Override
	protected void updateLayout() {
		try{
			layout.removeAllComponents();
			Design.read(new ByteArrayInputStream(editor.getValue().getBytes()), layout);
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
