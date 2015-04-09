package com.vaadin.declarative.demo;

import org.vaadin.addon.vol3.OLView;
import org.vaadin.addon.vol3.client.source.OLMapQuestLayerName;
import org.vaadin.addon.vol3.layer.OLLayer;
import org.vaadin.addon.vol3.layer.OLTileLayer;
import org.vaadin.addon.vol3.source.OLMapQuestSource;
import org.vaadin.addon.vol3.source.OLSource;

/**
 * View for the map sample
 * Created by Vaadin Ltd / mjhosio on 30/03/15.
 */
public class MapView extends SampleView{

	private MapLayout layout;

	public MapView() {
		super("MapLayout.html");
		layout=new MapLayout();
		layout.setSizeFull();
		setFirstComponent(layout);
		initMap();
	}

	private void initMap() {
		OLLayer layer=createLayer(createSource());
		layout.map.addLayer(layer);
		layout.map.setView(createView());
		layout.map.setSizeFull();
	}


	private OLSource createSource(){
		return new OLMapQuestSource(OLMapQuestLayerName.OSM);
	}

	private OLLayer createLayer(OLSource source){
		return new OLTileLayer(source);
	}

	private OLView createView(){
		OLView view=new OLView();
		view.setZoom(1);
		view.setCenter(0,0);
		return view;
	}
}
