package com.vaadin.declarative.demo;

import com.vaadin.data.Item;
import com.vaadin.data.util.IndexedContainer;
import com.vaadin.ui.Button;

/**
 * Created by Vaadin Ltd / mjhosio on 30/03/15.
 */
public class NestedDesignsView extends SampleView{

	private NestedDesignsLayout layout;
	private IndexedContainer container;

	public NestedDesignsView() {
		super("NestedDesignsLayout.html");
		layout = new NestedDesignsLayout();
		this.setFirstComponent(layout);
		initData();
		initSaveListener();
	}

	private void initSaveListener() {
		layout.editor.saveButton.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(Button.ClickEvent event) {
				Object id=container.addItem();
				container.getItem(id).getItemProperty("Item").setValue(layout.editor.itemField.getValue());
			}
		});
	}


	private void initData() {
		container=new IndexedContainer();
		container.addContainerProperty("Item",String.class, "");
		container.addContainerProperty("Quantity",Integer.class, 0);
		container.addContainerProperty("Price",Double.class, 0);
		for(int i=0;i<1000;i++){
			Item item = container.addItem(i);
			item.getItemProperty("Item").setValue("Item_"+i);
			item.getItemProperty("Quantity").setValue(i%10);
			item.getItemProperty("Price").setValue(i/10d);
		}
		layout.grid.setContainerDataSource(container);
	}
}
