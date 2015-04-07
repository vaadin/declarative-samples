package com.vaadin.declarative.demo;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.Component;
import com.vaadin.ui.HorizontalSplitPanel;
import org.vaadin.aceeditor.AceEditor;
import org.vaadin.aceeditor.AceMode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Base class for demo views
 * Created by Vaadin Ltd / mjhosio on 30/03/15.
 */
public class SampleView extends HorizontalSplitPanel implements View {

	protected AceEditor editor;

	public SampleView(){

	}

	public SampleView(String templateName){
		setSecondComponent(createMarkupView(templateName));
		setSplitPosition(40, Unit.PERCENTAGE);
		setSizeFull();
	}

	protected Component createMarkupView(String templateName){
		editor = new AceEditor();
		editor.setValue(readFile(templateName));
		editor.setSizeFull();
		editor.setMode(AceMode.html);
		editor.setShowPrintMargin(false);
		editor.setReadOnly(true);
		return editor;
	}

	private String readFile(String fileName){
		StringBuilder builder=new StringBuilder();
		BufferedReader reader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(fileName)));
		try {
			String line=null;
			while((line=reader.readLine()) != null){
				builder.append(line).append("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return builder.toString();
	}

	@Override
	public void enter(ViewChangeListener.ViewChangeEvent viewChangeEvent) {

	}
}
