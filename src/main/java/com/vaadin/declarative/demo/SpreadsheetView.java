package com.vaadin.declarative.demo;

import java.io.IOException;

/**
 * Created by Vaadin Ltd / mjhosio on 30/03/15.
 */
public class SpreadsheetView extends SampleView{

	private SpreadsheetLayout layout;

	public SpreadsheetView() {
		super("SpreadsheetLayout.html");
		layout=new SpreadsheetLayout();
		layout.setSizeFull();
		setFirstComponent(layout);
		loadSheet();
	}

	private void loadSheet() {
		try {
			layout.spreadsheet.read(SpreadsheetView.class.getResourceAsStream("sample_sheet.xlsx"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
