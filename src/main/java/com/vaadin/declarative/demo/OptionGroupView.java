package com.vaadin.declarative.demo;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;

/**
 * Created by Vaadin Ltd / mjhosio on 30/03/15.
 */
public class OptionGroupView extends SampleView implements View {

	public OptionGroupView(){
		super("OptionGroupLayout.html");
		setFirstComponent(new OptionGroupLayout());
	}

	@Override
	public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {

	}
}
