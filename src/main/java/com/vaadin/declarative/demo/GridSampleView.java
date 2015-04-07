package com.vaadin.declarative.demo;

import com.vaadin.data.util.BeanItemContainer;

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
		BeanItemContainer<Item> container=new BeanItemContainer<Item>(Item.class);
		for(int i=0;i<1000;i++){
			Item item=new Item("Item_"+i,i%10,i/10d);
			container.addItem(item);
		}
		gridSampleLayout.grid.setContainerDataSource(container);
	}

}
