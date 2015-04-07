package com.vaadin.declarative.demo;

import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.VerticalLayout;

/**
 * View for the NestedDesignsLayout
 * Created by Vaadin Ltd / mjhosio on 30/03/15.
 */
public class NestedDesignsView extends SampleView{

	private NestedDesignsLayout layout;
	private BeanItemContainer<Item> container;

	public NestedDesignsView() {
		super();
		layout = new NestedDesignsLayout();
		this.setFirstComponent(layout);
		initData();
		initSaveListener();
		VerticalLayout editors=new VerticalLayout();
		editors.setSpacing(true);
		editors.setSizeFull();
		Component rootEditor=createMarkupView("NestedDesignsLayout.html");
		rootEditor.setCaption("Root design");
		editors.addComponent(rootEditor);
		Component nestedEditor = createMarkupView("EditorFieldLayout.html");
		nestedEditor.setCaption("Nested design");
		editors.addComponent(nestedEditor);
		setSecondComponent(editors);
	}

	private void initSaveListener() {
		layout.editor.saveButton.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(Button.ClickEvent event) {
				Item item=new Item();
				item.setItem(layout.editor.itemField.getValue());
				item.setQuantity(Integer.parseInt(layout.editor.quantityField.getValue()));
				item.setPrice(Double.parseDouble(layout.editor.priceField.getValue()));
				container.addItem(item);
				clearEditor();
			}
		});
	}

	private void clearEditor(){
		layout.editor.itemField.setValue("");
		layout.editor.quantityField.setValue("");
		layout.editor.priceField.setValue("");
	}


	private void initData() {
		container=new BeanItemContainer<Item>(Item.class);
		for(int i=0;i<1000;i++) {
			Item item = new Item("Item_" + i, i % 10, i / 10d);
			container.addItem(item);
		}
		layout.grid.setContainerDataSource(container);
	}
}
