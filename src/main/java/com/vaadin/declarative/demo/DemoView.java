package com.vaadin.declarative.demo;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.CustomComponent;

/**
 * First view of the demo
 * Created by Vaadin Ltd / mjhosio on 27/03/15.
 */
public class DemoView extends CustomComponent implements View {

	public DemoView(){
		this.setCompositionRoot(new DemoLayout());
		this.setSizeFull();
	}

	@Override
	public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {

	}
}
