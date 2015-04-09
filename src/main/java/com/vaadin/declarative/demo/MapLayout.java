package com.vaadin.declarative.demo;

import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;
import org.vaadin.addon.vol3.OLMap;

/**
 * Design that uses open layers map
 * Created by Vaadin Ltd / mjhosio on 30/03/15.
 */
@DesignRoot
public class MapLayout extends VerticalLayout{

	protected OLMap map;

	public MapLayout(){
		Design.read(this);
	}
}
