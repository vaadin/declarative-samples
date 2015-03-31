package com.vaadin.declarative.demo;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

/**
 * Created by Vaadin Ltd / mjhosio on 27/03/15.
 */
public class DemoView extends CustomComponent implements View {

	public DemoView(){
		VerticalLayout content=new VerticalLayout();
		content.setSizeFull();
		Label label=new Label("Declarative Vaadin UIs");
		label.addStyleName("demo-label");
		label.setSizeUndefined();
		content.addComponent(label);
		content.setComponentAlignment(label, Alignment.MIDDLE_CENTER);
		this.setCompositionRoot(content);
		this.setSizeFull();
	}

	@Override
	public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {

	}
}
