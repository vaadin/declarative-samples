package com.vaadin.declarative.demo;

import com.vaadin.data.Item;
import com.vaadin.data.util.IndexedContainer;

/**
 * View for the grid sample
 * Created by Vaadin Ltd / mjhosio on 30/03/15.
 */
public class GridSampleView extends SampleView{

	private GridSampleLayout gridSampleLayout;

	public GridSampleView() {
		super("GridSampleLayout.html");
		gridSampleLayout = new GridSampleLayout();
		gridSampleLayout.setSizeFull();
		this.setFirstComponent(gridSampleLayout);
		initData();
	}

	private void initData() {
		IndexedContainer container=new IndexedContainer();
		container.addContainerProperty("Item",String.class, "");
		container.addContainerProperty("Quantity",Integer.class, 0);
		container.addContainerProperty("Price",Double.class, 0);
		for(int i=0;i<1000;i++){
			Item item = container.addItem(i);
			item.getItemProperty("Item").setValue("Item_"+i);
			item.getItemProperty("Quantity").setValue(i%10);
			item.getItemProperty("Price").setValue(i/10d);
		}
		gridSampleLayout.grid.setContainerDataSource(container);
	}

}
